package Server;

import java.net.Socket;

public class ServerProcess implements Runnable{

    private final Socket client;

    public ServerProcess(Socket client) {
        this.client=client;
    }

    @Override
    public void run() {

    }
}
