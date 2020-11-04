package TcpIpModel;

public class InternetProtocol {
    private ApplicationLayer applicationLayer;
    private TransportLayer transportLayer;
    private InternetLayer internetLayer;
    private LinkLayer linkLayer;

    public InternetProtocol(ApplicationLayer applicationLayer, TransportLayer transportLayer, InternetLayer internetLayer, LinkLayer linkLayer) {
        this.applicationLayer = applicationLayer;
        this.transportLayer = transportLayer;
        this.internetLayer = internetLayer;
        this.linkLayer = linkLayer;
    }

    public ApplicationLayer getApplicationLayer() {
        return applicationLayer;
    }

    public TransportLayer getTransportLayer() {
        return transportLayer;
    }

    public InternetLayer getInternetLayer() {
        return internetLayer;
    }

    public LinkLayer getLinkLayer() {
        return linkLayer;
    }
}