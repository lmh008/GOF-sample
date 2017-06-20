package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public interface TCPState {

    void connect(TCPConnect tcpConnect);

    void sendData(TCPConnect tcpConnect, String data);

    void close(TCPConnect tcpConnect);
}
