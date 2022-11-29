import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

class client{

    public static void main(String[] args) throws Exception {

        String ip = "localhost";
        int port = 9998;
        Socket s = new Socket(ip, port); 

        String str="Random string";
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        os.write(str);
        os.flush();

        


        
    }
}