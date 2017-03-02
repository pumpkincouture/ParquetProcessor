package JavaServer.runner;

import JavaServer.connections.ConnectionManager;
import JavaServer.requests.Logger;
import JavaServer.sockets.ServerSocketService;
import JavaServer.sockets.SocketService;

import java.io.*;
import java.util.concurrent.ExecutorService;

public class Server {
  private ServerSocketService serverSocketService;
  private int port;

  public Server(ServerSocketService serverSocketService) {
    this.serverSocketService = serverSocketService;
  }

  public void run() throws IOException {
    SocketService clientSocket = serverSocketService.accept();
    executorService.execute(new ConnectionManager(clientSocket));
  }
}
