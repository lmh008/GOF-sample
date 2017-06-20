package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public class InitState implements TCPState{

    @Override
    public void connect(TCPConnect tcpConnect) {
        System.out.println("tcp connect!");
        tcpConnect.setTcpState(new EstablishedState());
    }

    @Override
    public void sendData(TCPConnect tcpConnect, String data) {
        throw new IllegalStateException();
    }

    @Override
    public void close(TCPConnect tcpConnect) {
        throw new IllegalStateException();
    }
}
