package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public class EstablishedState implements TCPState {

    @Override
    public void connect(TCPConnect tcpConnect) {
        System.out.println("warn! already connect");
    }

    @Override
    public void sendData(TCPConnect tcpConnect, String data) {
        System.out.println("send data:" + data);
    }

    @Override
    public void close(TCPConnect tcpConnect) {
        System.out.println("tcp closed!");
        tcpConnect.setTcpState(new ClosedState());
    }
}
