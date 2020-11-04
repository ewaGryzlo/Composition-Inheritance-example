package Datagram;

public class Segment {
    private String tcpHeader;
    private String data;

    public Segment(String tcpHeader, String data) {
        this.tcpHeader = tcpHeader;
        this.data = data;
    }

    public void getSegment(){
        System.out.println("1.Source and destination ports= " + this.tcpHeader);
        System.out.println("2.Data = " + this.data);

    }


}
