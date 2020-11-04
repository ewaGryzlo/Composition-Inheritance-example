package Datagram;

public class DataEncapsulation  {
    private Segment segment;
    private Packet packet;
    private Frame frame;

    public DataEncapsulation(Segment segment, Packet packet, Frame frame) {
        this.segment = segment;
        this.packet = packet;
        this.frame = frame;
    }
    public void loadingSegment(){
        System.out.println("====== Datagram.Segment ======");
        segment.getSegment();
    }
    public void loadingPacket(){
        System.out.println("====== Datagram.Packet ======");
        packet.getPacket();
    }
    public void loadingFrame(){
        System.out.println("====== Datagram.Frame ======");
        frame.getFrame();
    }
}
