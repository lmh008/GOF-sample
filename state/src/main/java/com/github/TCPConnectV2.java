package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public class TCPConnectV2 {

    private TCPState tcpState;

    private TCPState intiState;

    private TCPState establishedState;

    private TCPState closedState;

    public TCPConnectV2() {
        intiState = new InitState();
        establishedState = new EstablishedState();
        closedState = new ClosedState();
        this.tcpState = intiState;
    }

     /*public void connect() {
        this.tcpState.connect(this);
    }

    public void sendData(String data) {
        this.tcpState.sendData(this, data);
    }

    public void close() {
        this.tcpState.close(this);
    }*/

    public TCPState getTcpState() {
        return tcpState;
    }

    public void setTcpState(TCPState tcpState) {
        this.tcpState = tcpState;
    }

    public TCPState getIntiState() {
        return intiState;
    }

    public void setIntiState(TCPState intiState) {
        this.intiState = intiState;
    }

    public TCPState getEstablishedState() {
        return establishedState;
    }

    public void setEstablishedState(TCPState establishedState) {
        this.establishedState = establishedState;
    }

    public TCPState getClosedState() {
        return closedState;
    }

    public void setClosedState(TCPState closedState) {
        this.closedState = closedState;
    }

}
