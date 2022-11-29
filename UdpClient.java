import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

class UdpClient{
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        int i=8;
        byte[] b = String.valueOf(i).getBytes();

        InetAddress ia =InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(b, b.length, ia, 9999);
        ds.send(dp);

        byte[] b1 = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
        ds.receive(dp1);

        String str = new String(dp1.getData(),0,dp1.getLength());
        System.out.println("result is "+ str); 
        
    }
}