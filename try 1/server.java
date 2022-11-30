import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    
    public static void main(String[] args) throws Exception {
        System.out.println("server is started");
        ServerSocket ss = new ServerSocket(9998);

        System.out.println("server is waiting for client request");
        Socket s= ss.accept();
        System.out.println("client connected");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();

        System.out.println("client data : "+ str);
        

    }
}
