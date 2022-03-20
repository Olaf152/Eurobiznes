import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException{
        System.out.println("Waiting for client...");
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();

        System.out.println("Client connected");

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("client: " + str);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("Raczej nie inaczej");
        pr.flush();
    }
}
