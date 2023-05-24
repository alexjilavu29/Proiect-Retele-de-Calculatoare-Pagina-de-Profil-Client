import java.io.*; import java.awt.*; import java.awt.event.*;

class FormDesign extends Frame {

// implements Serializable este implicit

    boolean open=true;
    Choice gender; List lista; 
    Label lastName,firstName, age;
    TextField textLastName,textFirstName, textAge; 
    Button button;

    FormDesign() {

        setLayout(new FlowLayout());

        gender=new Choice();

        firstName = new Label("Prenume: ");
        lastName = new Label("Nume de familie: ");
        
        textFirstName =new TextField("     ");
        textLastName =new TextField("     ");
        
        gender.addItem("Femeie"); gender.addItem("Barbat");

        age = new Label("Vârstă: ");
        textAge = new TextField("   ");

       

        button = new Button("Adăugare");

        add(firstName); add(textFirstName);
        add(lastName);  add(textLastName);
        add(gender);
        add(age);  add(textAge);
        add(button);



        FormHandler fh = new FormHandler(this);

        button.addActionListener(fh);

    }

}

