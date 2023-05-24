import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

class FormHandler implements ActionListener, Serializable {
    public FormDesign fd;

    FormHandler(FormDesign fd)
    {
        this.fd = fd;
    }

    public void actionPerformed(ActionEvent e)
    {
        String firstName = fd.textFirstName.getText().trim();
        String lastName = fd.textLastName.getText().trim();
        String ageStr = fd.textAge.getText().trim();
        if (firstName.isEmpty() || lastName.isEmpty() || ageStr.isEmpty()) {
            System.out.println("Toate campurile sunt obligatorii!");
            return;
        }
        int age = 0;
        try {
            age = Integer.parseInt(ageStr);
        } catch (NumberFormatException nfe) {
            System.out.println("Varsta trebuie sa fie un numar!");
            return;
        }
        fd.open=false;
    }

}

