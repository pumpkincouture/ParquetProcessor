package parquetprocessor;

import java.io.IOException;
import java.net.ServerSocket;

import parquetprocessor.config.ArgParser;

public class Main {
  static public void main(String args[]) {
    ArgParser argParser = new ArgParser(args);
    try {
      ServerSocket serverSocket = new ServerSocket(argParser.getPortNumber());

      Server server = new Server(serverSocket);
      server.run();
    } catch (Exception e) {
      System.err.println(e.getMessage());
      System.exit(1);
    }
  }
}
