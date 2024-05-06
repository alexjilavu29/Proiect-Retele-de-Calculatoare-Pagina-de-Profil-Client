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
