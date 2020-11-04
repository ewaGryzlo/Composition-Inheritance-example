package Datagram;

public class Frame {
    private Packet packet;
    private String frameHeader;
    private String frameFooter;

    public Frame(Packet packet, String frameHeader, String frameFooter) {
        this.packet = packet;
        this.frameHeader = frameHeader;
        this.frameFooter = frameFooter;
    }

    public void getFrame(){
        packet.getPacket();
        System.out.println("4.FrameHeader = " + frameHeader );
        System.out.println("5.FrameFooter = " + frameFooter) ;
    }
}
