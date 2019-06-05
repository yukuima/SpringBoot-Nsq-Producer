package com.myk.learning.nsq.service;

/**
 * Created in 2019.03.05
 *
 * @author myk
 */
public interface MqProductService {

    /**
     * Send test message.
     *
     * @param body the body
     * @return the string
     */
    String sendTestMessage(String body);

    /**
     * 发送自定义消息体，确保特定channel接收
     *
     * @param body the body
     * @return the string
     */
    String sendTestMessageByChannel(String body);
}
