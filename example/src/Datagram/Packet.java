package Datagram;

public class Packet {
    private Segment segment;
    private String ipHeader;

    public Packet(Segment segment, String ipHeader) {
        this.segment = segment;
        this.ipHeader = ipHeader;
    }
    public void getPacket(){
        this.segment.getSegment();
        System.out.println("3.IP Header = " + this.ipHeader );
    }
}
