package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 *
 * State(状态，如TCPState)
 * —定义一个接口以封装与Context的一个特定状态相关的行为
 */
public interface TCPState {

    void connect(TCPConnect tcpConnect);

    void sendData(TCPConnect tcpConnect, String data);

    void close(TCPConnect tcpConnect);
}
