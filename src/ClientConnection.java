// Unitatea de compilare Proiect_C.java

import java.io.*; import java.net.*;

import java.awt.*; import java.awt.event.*;

class ClientConnection {

    public static void main(String[] sss) throws Exception {

        Socket newSocket = new Socket("localhost",5555);
        FormDesign fd = new FormDesign();

        fd.setSize(250,180);
        fd.setVisible(true);

        while(fd.open)
            Thread.sleep(10);

        OutputStream os = newSocket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);

        oos.writeObject(fd);
        System.out.println("Parcurgere listă clienți executată.");

        fd.dispose();
        os.close();
        oos.close();
        newSocket.close();

    }
}