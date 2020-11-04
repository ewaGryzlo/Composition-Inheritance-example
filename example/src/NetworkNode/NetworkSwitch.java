package NetworkNode;

public class NetworkSwitch extends NetworkDevice{

    public NetworkSwitch(String manufacturer, String mac, int ports) {
        super(manufacturer, mac, ports, true, true, false);
    }
    public void powerUp(String manufacturer){
        System.out.println("Switch " + manufacturer + " is active");
    }

}
