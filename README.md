# Java Sockets and Threads Project

## Overview

This Java project demonstrates the use of sockets and threads to create a simple client-server application. It features GUI components for user interaction and network communication to transmit objects over a socket. This project provides a practical example of serializing Java objects, managing threads, and creating GUI forms using AWT and Swing.

## Key Features

- **Client-Server Communication:** The project implements a basic client-server architecture where the client sends a serialized object (a form) to the server via sockets.
- **Thread Management:** The server handles each client connection in a separate thread, allowing multiple clients to connect and interact with the server simultaneously.
- **Graphical User Interface:** The client and server both feature GUIs built using Java's AWT and Swing libraries. The client GUI allows users to input their details which are then sent to the server and displayed.

## Modules Description

### ClientConnection (Client Side)

- Establishes a socket connection to the server.
- Sends a `FormDesign` object to the server after the form is filled out and submitted.
- Uses threading to wait for the form submission before proceeding to send the object.

### FormDesign

- A GUI class that creates a form for user input including fields for name, age, and gender.
- Utilizes Java AWT for layout and components.
- Integrates action listener to handle form submission.

### FormHandler

- Implements `ActionListener` and handles the logic to process form data.
- Checks if all fields are filled and validates that the age input is a numerical value.

### ServerConnection (Server Side)

- A thread that manages the connection for each client.
- Reads the `FormDesign` object sent by the client, displays it, and keeps the server GUI updated until the client disconnects.

### ServerDetails

- Sets up the server socket and listens for incoming client connections.
- Instantiates `ServerConnection` for each client, ensuring that each client is handled in its own thread.

### ServerDisplay

- Displays a server GUI using Swing components.
- Outputs the information received from clients in a structured format on the GUI.

## How to Use

1. **Start the Server:** Run the `ServerDetails` class to start the server. It listens on port 5555 for client connections.
2. **Run the Client:** Execute the `ClientConnection` class. This opens a GUI for entering user details.
3. **Input Data and Submit:** Fill in the details in the client GUI and press the submit button to send the data to the server.
4. **View Server Output:** Check the server GUI to see the data received from the client displayed.

## Conclusion

This project illustrates fundamental concepts of Java networking and multi-threading alongside GUI development. It's an excellent basis for understanding client-server interactions, thread safety, and GUI handling in Java.


### Roumanian Translation Below
---


# Proiect Java cu Sockets și Threads

## Prezentare generală

Acest proiect Java demonstrează utilizarea socket-urilor și a thread-urilor pentru a crea o aplicație simplă client-server. Include componente GUI pentru interacțiunea cu utilizatorul și comunicație în rețea pentru transmiterea obiectelor prin socket. Acest proiect oferă un exemplu practic de serializare a obiectelor Java, gestionare a thread-urilor și creare de formulare GUI utilizând bibliotecile AWT și Swing.

## Caracteristici principale

- **Comunicare Client-Server:** Proiectul implementează o arhitectură client-server de bază în care clientul trimite un obiect serializat (un formular) serverului prin socket-uri.
- **Gestionarea Thread-urilor:** Serverul gestionează fiecare conexiune client într-un thread separat, permițând mai multor clienți să se conecteze și să interacționeze cu serverul simultan.
- **Interfață Grafică Utilizator:** Atât clientul, cât și serverul dispun de interfețe grafice realizate folosind bibliotecile AWT și Swing ale Java. Interfața grafică a clientului permite utilizatorilor să introducă detaliile lor, care sunt apoi trimise și afișate de server.

## Descrierea Modulelor

### ClientConnection (Partea Client)

- Stabilește o conexiune socket cu serverul.
- Trimite un obiect `FormDesign` serverului după ce formularul este completat și trimis.
- Folosește thread-uri pentru a aștepta trimiterea formularului înainte de a proceda la trimiterea obiectului.

### FormDesign

- O clasă GUI care creează un formular pentru introducerea datelor utilizatorului, inclusiv câmpuri pentru nume, vârstă și gen.
- Utilizează Java AWT pentru layout și componente.
- Integrează un ascultător de acțiuni pentru a gestiona trimiterea formularului.

### FormHandler

- Implementează `ActionListener` și gestionează logica de procesare a datelor din formular.
- Verifică dacă toate câmpurile sunt completate și validează că intrarea pentru vârstă este o valoare numerică.

### ServerConnection (Partea Server)

- Un thread care gestionează conexiunea pentru fiecare client.
- Citește obiectul `FormDesign` trimis de client, îl afișează și menține GUI-ul serverului actualizat până când clientul se deconectează.

### ServerDetails

- Configurează socketul serverului și ascultă conexiunile clientilor în așteptare.
- Instanțiază `ServerConnection` pentru fiecare client, asigurându-se că fiecare client este gestionat în propriul său thread.

### ServerDisplay

- Afișează un GUI de server folosind componente Swing.
- Afișează informațiile primite de la clienți într-un format structurat pe GUI.

## Cum să Utilizați

1. **Pornește Serverul:** Rulează clasa `ServerDetails` pentru a porni serverul. Acesta ascultă conexiuni de la clienți pe portul 5555.
2. **Rulează Clientul:** Execută clasa `ClientConnection`. Acesta deschide o GUI pentru introducerea detaliilor utilizatorului.
3. **Introduceți Datele și Trimiteți:** Completați detaliile în GUI-ul clientului și apăsați butonul de trimitere pentru a trimite datele la server.
4. **Vizualizați Rezultatele pe Server:** Verificați GUI-ul serverului pentru a vedea datele primite de la client afișate.

## Concluzie

Acest proiect ilustrează conceptele fundamentale de rețelistică și multi-threading în Java alături de dezvoltarea GUI. Este o bază excelentă pentru înțelegerea interacțiunilor client-server, securitatea thread-urilor și gestionarea GUI în Java.

