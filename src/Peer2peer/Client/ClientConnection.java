package Peer2peer.Client;

import java.io.IOException;
import java.net.Socket;

public class ClientConnection {
    public static final String DEFAULT_SERVER_ADDRESS = "localhost";
    public static final int DEFAULT_PORT_NUMBER = 8888;

    private Socket clientSocket;
    private ClientProcess clientProcess;

    public ClientConnection(){
        try {
            clientSocket = new Socket(DEFAULT_SERVER_ADDRESS, DEFAULT_PORT_NUMBER);
            //clientSide = new ClientSide(clientSocket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
