package NetworkNode;

public class Node {

    private Hub hub;
    private NetworkSwitch networkSwitch;
    private Router router;


    public Node(Hub hub, NetworkSwitch networkSwitch, Router router) {
        this.hub = hub;
        this.networkSwitch = networkSwitch;
        this.router = router;
    }

    public Hub getHub() {
        return hub;
    }

    public NetworkSwitch getNetworkSwitch() {
        return networkSwitch;
    }

    public Router getRouter() {
        return router;
    }

}
