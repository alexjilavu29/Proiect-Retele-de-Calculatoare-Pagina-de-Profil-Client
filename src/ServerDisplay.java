import javax.swing.*;
class ServerDisplay {
    JTextArea textArea = new JTextArea();

    ServerDisplay() {
        JFrame frame = new JFrame("Server");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(210, 500);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
    synchronized void scrie(FormDesign fd) {
        // ...
        String info = "___ Pagina de profil Client ___\n" +
                "Prenume client: " + fd.textFirstName.getText() + "\n" +
                "Nume client: " + fd.textLastName.getText() + "\n" +
                "Gen client: " + fd.gender.getSelectedItem() + "\n" +
                "Vărstă client: " + fd.textAge.getText() + "\n" +
                "_________________________" +
                "\n\n";
        System.out.println(" Pagina de profil Client:");
        System.out.println("Prenume client: "+fd.textFirstName.getText());
        System.out.println("Nume client: "+fd.textLastName.getText());

        String string = fd.gender.getSelectedItem();

        System.out.println("Sex: "+string); System.out.print("List: ");

        System.out.println("Varsta: "+fd.textAge.getText());

        System.out.println("________________________");
        System.out.println("\n");
        textArea.append(info);
    }

}