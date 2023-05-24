import java.util.*;
import java.net.*;

class ServerDetails {

    public static void main(String[] sss) throws Exception {

        Scanner sc = new Scanner(System.in);
        ServerSocket socket = new ServerSocket(5555);

        Socket newSocket = null;
        ServerDisplay sd = new ServerDisplay();

        for (;;) {
            newSocket = socket.accept();
            new ServerConnection(newSocket,sd);
        }
    }
}