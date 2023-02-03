package dev.tanpn.grpc.message;

import java.util.Map;

public interface BaseMessage<T, V> {
    Map<String, T> doExecute(Map<String, V> pMessage) throws Exception;
}
