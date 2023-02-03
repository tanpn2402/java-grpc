package dev.tanpn.utils.tags;

public interface TagName extends RequestBodyTag {
    final static String B_ENTERORDER = "enterOrder";
    final static String B_CANCELORDER = "cancelOrder";
    final static String B_ORDERENQUIRY = "orderEnquiry";

    final static String CLIENTID = "CLIENTID";
    final static String ORDERID = "ORDERID";
    final static String QTY = "QTY";
    final static String PRICE = "PRICE";
    final static String STOCKID = "STOCKID";
    final static String MARKETID = "MARKETID";
    final static String STATUS = "STATUS";
    final static String LIST = "LIST";

    final static String SUCCESS = "SUCCESS";
    final static String MESSAGE = "MESSAGE";
}
