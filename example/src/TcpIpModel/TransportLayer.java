package TcpIpModel;

public class TransportLayer {
    private int tcp; //transmission control protocol
    private int udp; //user datagram protocol
    private int port;


    public TransportLayer(int tcp, int udp, int port) {
        this.tcp = tcp;
        this.udp = udp;
        this.port = port;
    }

    public int getTcp() {
        return tcp;
    }

    public int getUdp() {
        return udp;
    }

    public int getPort() {
        return port;
    }
}
