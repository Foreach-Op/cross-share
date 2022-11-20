package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnection {
    private final int PORT=8888;
    private ServerSocket serverSocket;

    public ServerConnection(){
        try {
            serverSocket = new ServerSocket(PORT);
        }catch (IOException ioException) {
            ioException.printStackTrace();
        }

        while (true){
            Listen();
        }
    }

    private void Listen(){
        try {
            Socket client=serverSocket.accept();
            System.out.println();
            ServerProcess serverProcess=new ServerProcess(client);
            Thread thread=new Thread(serverProcess);
            thread.start();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
