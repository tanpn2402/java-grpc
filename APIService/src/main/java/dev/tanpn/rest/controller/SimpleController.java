package dev.tanpn.rest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import com.fasterxml.jackson.databind.JsonNode;

import dev.tanpn.grpc.message.BaseMessage;
import dev.tanpn.utils.tags.TagName;

@RestController
@RequestMapping("/api")
public class SimpleController {
    private ApplicationContext mvApplicationContext;

    @Autowired
    public void context(ApplicationContext pApplicationContext) {
        this.mvApplicationContext = pApplicationContext;
    }

    @PostMapping("/enterOrder")
    public ResponseEntity<Map<String, String>> enterOrder(@RequestBody JsonNode payload) throws Exception {
        Map<String, String> lvResp = new HashMap<>();
        lvResp.put(TagName.L_STATUS, HttpStatus.OK.name());

        if (mvApplicationContext.containsBean(TagName.B_ENTERORDER)) {
            Map<String, String> lvEnterOrderReq = new HashMap<>();
            lvEnterOrderReq.put(TagName.CLIENTID, payload.get(TagName.L_CLIENTID).asText());
            lvEnterOrderReq.put(TagName.QTY, payload.get(TagName.L_QTY).asText());
            lvEnterOrderReq.put(TagName.PRICE, payload.get(TagName.L_PRICE).asText());
            lvEnterOrderReq.put(TagName.STOCKID, payload.get(TagName.L_STOCKID).asText());
            lvEnterOrderReq.put(TagName.MARKETID, payload.get(TagName.L_MARKETID).asText());

            BaseMessage<String, String> lvEnterOrder = (BaseMessage) mvApplicationContext.getBean(TagName.B_ENTERORDER);
            lvResp = lvEnterOrder.doExecute(lvEnterOrderReq);
        }

        return new ResponseEntity<>(lvResp, HttpStatus.OK);
    }

    @PostMapping("/orderEnquiry")
    public ResponseEntity<Map<String, Object>> orderEnquiry(@RequestBody JsonNode payload) throws Exception {
        Map<String, Object> lvResp = new HashMap<>();
        lvResp.put(TagName.L_STATUS, HttpStatus.OK.name());

        if (mvApplicationContext.containsBean(TagName.B_ORDERENQUIRY)) {
            Map<String, String> lvOrderEnqReq = new HashMap<>();
            lvOrderEnqReq.put(TagName.CLIENTID, payload.get(TagName.L_CLIENTID).asText());
            lvOrderEnqReq.put(TagName.STOCKID, payload.get(TagName.L_STOCKID).asText());
            lvOrderEnqReq.put(TagName.MARKETID, payload.get(TagName.L_MARKETID).asText());

            BaseMessage<Object, String> lvOrderEnq = (BaseMessage) mvApplicationContext.getBean(TagName.B_ORDERENQUIRY);
            lvResp = lvOrderEnq.doExecute(lvOrderEnqReq);
        }

        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.put("Cache-Control", Arrays.asList("no-cache, no-store, max-age=0, must-revalidate"));
        return new ResponseEntity<>(lvResp, headers, HttpStatus.OK);
    }

    @PostMapping("/cancelOrder")
    public ResponseEntity<Map<String, Object>> cancelOrder(@RequestBody JsonNode payload) throws Exception {
        Map<String, Object> lvResp = new HashMap<>();
        lvResp.put(TagName.L_STATUS, HttpStatus.OK.name());

        if (mvApplicationContext.containsBean(TagName.B_CANCELORDER)) {
            if (payload.get(TagName.L_ORDERS) != null) {
                Map<String, Object> lvCancelOrderReq = new HashMap<>();
                List<Map<String, String>> lvOrders = new ArrayList<>();
                final String lvClientID = payload.get(TagName.L_CLIENTID).asText();
                lvCancelOrderReq.put(TagName.CLIENTID, lvClientID);
                payload.get(TagName.L_ORDERS).elements().forEachRemaining(node -> {
                    Map<String, String> lvOrder = new HashMap<>();
                    lvOrder.put(TagName.CLIENTID, lvClientID);
                    lvOrder.put(TagName.ORDERID, node.get(TagName.L_ORDERID).asText());
                    lvOrders.add(lvOrder);
                });
                lvCancelOrderReq.put(TagName.LIST, lvOrders);

                BaseMessage<Object, Object> lvCancelOrder = (BaseMessage) mvApplicationContext
                        .getBean(TagName.B_CANCELORDER);
                lvResp = lvCancelOrder.doExecute(lvCancelOrderReq);
            } else {
                lvResp.put(TagName.L_STATUS, HttpStatus.INTERNAL_SERVER_ERROR);
                lvResp.put(TagName.L_ERROR, "Invalid list of order");
                return new ResponseEntity<>(lvResp, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(lvResp, HttpStatus.OK);
    }
}
