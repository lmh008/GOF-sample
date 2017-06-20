package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 * 对象收到其他对象的请求时
 * 它根据自身的当前状态作出不同的反应
 */
public class TCPConnect {

    private TCPState tcpState;

    private TCPState intiState;

    private TCPState establishedState;

    private TCPState closedState;

    public TCPConnect() {
        this.tcpState = new InitState();
    }

    public void connect() {
        this.tcpState.connect(this);
    }

    public void sendData(String data) {
        this.tcpState.sendData(this, data);
    }

    public void close() {
        this.tcpState.close(this);
    }

    public TCPState getTcpState() {
        return tcpState;
    }

    public void setTcpState(TCPState tcpState) {
        this.tcpState = tcpState;
    }
}
