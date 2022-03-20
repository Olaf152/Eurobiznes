import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost", 4999);

        Scanner scanner = new Scanner(System.in);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        System.out.print("client: ");
        String wiadomosc = scanner.nextLine();
        //System.out.println("client: " + wiadomosc);
        pr.println(wiadomosc);
        pr.flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("server: " + str);
    }
}
