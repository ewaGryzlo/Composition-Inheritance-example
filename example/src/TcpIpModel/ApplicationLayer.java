package TcpIpModel;

public class ApplicationLayer {
    private int dhcp; //dynamic host configuration protocol
    private int dns; //domain name system
    private int ftp; // file transfer protocol
    private int http; //hypertext transfer protocol
    private int port;

    public ApplicationLayer(int dhcp, int dns, int ftp, int http, int port) {
        this.dhcp = dhcp;
        this.dns = dns;
        this.ftp = ftp;
        this.http = http;
        this.port = port;
    }

    public int getDhcp() {
        return dhcp;
    }

    public int getPort() {
        return port;
    }

    public int getDns() {
        return dns;
    }

    public int getFtp() {
        return ftp;
    }

    public int getHttp() {
        return http;
    }
}
