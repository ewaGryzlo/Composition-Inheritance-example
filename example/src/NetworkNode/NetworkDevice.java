package NetworkNode;

public class NetworkDevice {
    private String manufacturer;
    private String mac; // Media Access Control
    private int ports; //number of ports
    private boolean routingTable;
    private boolean ipAddress;
    private boolean nat; //compatible with Network Address Translation

    public NetworkDevice(String manufacturer, String mac, int ports, boolean routingTable, boolean ipAddress, boolean nat) {
        this.manufacturer = manufacturer;
        this.mac = mac;
        this.ports = ports;
        this.routingTable = routingTable;
        this.ipAddress = ipAddress;
        this.nat = nat;
    }

    public boolean isNat() {
        return nat;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMac() {
        return mac;
    }

    public int getPorts() {
        return ports;
    }

    public boolean isRoutingTable() {
        return routingTable;
    }

    public boolean isIpAddress() {
        return ipAddress;
    }
}
