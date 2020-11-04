package TcpIpModel;

public class InternetLayer {
    private int IPv4;
    private int IPv6;


    public InternetLayer(int IPv4, int IPv6) {
        this.IPv4 = IPv4;
        this.IPv6 = IPv6;
    }

    public int getIPv4() {
        return IPv4;
    }

    public int getIPv6() {
        return IPv6;
    }


}
