import Datagram.DataEncapsulation;
import Datagram.Frame;
import Datagram.Packet;
import Datagram.Segment;

public class Main {
    public static void main(String[] args) {

        Segment segment = new Segment(":(68):(67)", "some data");
        Packet packet = new Packet(segment, "some IP");
        Frame frame = new Frame(packet, "example frameHeader", " example frameFooter");
        DataEncapsulation dataEncapsulation = new DataEncapsulation(segment, packet, frame);
        dataEncapsulation.loadingSegment();
        System.out.println();
        dataEncapsulation.loadingPacket();
        System.out.println();
        dataEncapsulation.loadingFrame();
    }
}
