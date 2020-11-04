package NetworkNode;

public class Hub extends NetworkDevice {

    public Hub(String mac, int ports) {
        super("Cisco", mac, ports, false, false,false);
    }

}
