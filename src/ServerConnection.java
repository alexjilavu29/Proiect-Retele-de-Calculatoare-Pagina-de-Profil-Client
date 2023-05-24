import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

class ServerConnection extends Thread {

    ServerDisplay sd;
    Socket newSocket;

    ServerConnection(Socket newSocket,ServerDisplay sd) throws Exception {
        this.sd = sd;
        this.newSocket = newSocket;
        start();
    }

    public void run() {
        try {
            InputStream is = newSocket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);

            FormDesign fd = (FormDesign) ois.readObject();
            fd.open=true;

            fd.setSize(700,30);
            fd.setVisible(true);
            sd.scrie(fd);

            try {
                while(fd.open)
                    Thread.sleep(10); }

            catch(InterruptedException ie) { }

            fd.dispose();

            newSocket.close();
            is.close();
            ois.close();

        }

        catch(IOException e) { }

        catch(ClassNotFoundException e) { }

    }

}