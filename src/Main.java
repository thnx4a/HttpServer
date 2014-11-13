import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);

        Socket socket;
        while (true){
            socket = ss.accept();
            System.out.println(socket.getInetAddress());
        }

        //netstat /a
        //wireshark
    }
}
