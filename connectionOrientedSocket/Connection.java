import java.net.*;
import java.io.*;
class Connection extends Thread { //extends thread
  DataInputStream in;
  DataOutputStream out;
  Socket clientSocket;

  public Connection(Socket aClientSocket)  { 
    try {
      clientSocket = aClientSocket;
      in = new DataInputStream(clientSocket.getInputStream());
      out = new DataOutputStream(clientSocket.getOutputStream());
      start(); //breyta í start
    } catch (IOException e) { System.out.println("Connection:" + e.getMessage()); }
  }
  public void run() { //run
    //hérna fer þá fibonacci/teljari --v
    try { // an echo server
      String data = in.readUTF(); // read a line of data from the stream
      out.writeUTF(data);
    } catch (EOFException e) { System.out.println("EOF:" + e.getMessage());
    } catch (IOException e) { System.out.println("readline:" + e.getMessage());
    } finally {
      try {
        clientSocket.close();
      } catch (IOException e) {/* close failed */
      }
    }
  }
  
}
// 1
// javac *.java
// java ConnectionOrientedServer

