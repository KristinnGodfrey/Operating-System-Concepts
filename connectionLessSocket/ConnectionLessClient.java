//Kristinn Godfrey Guðnason
//kgg16@hi.is
import java.io.*;
import java.net.*;

public class ConnectionLessClient {
  public static void main(String args[]) { // args[0]: message contents,
                                           // args[1]: destination hostname
                                           // args[2]: number of packets sent
    DatagramSocket aSocket = null;
    try {
      aSocket = new DatagramSocket();
      byte[] message = args[0].getBytes();
      InetAddress aHost = InetAddress.getByName(args[1]);
      int serverPort = 6789; // agreed port
      DatagramPacket request = new DatagramPacket(message, message.length,
                  aHost, serverPort);
      aSocket.send(request);    

      int nPackets = 5;
      if(args.length == 3) {
        nPackets = Integer.parseInt(args[2]);
      }      
      for(int i=0; i < nPackets; i++) {
        byte[] buffer = new byte[1000];
        DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
        aSocket.receive(reply);
        String s = new String(reply.getData());
        System.out.println("Reply: " + s);
        request = new DatagramPacket(s.getBytes(), message.length,
                  aHost, serverPort);
      aSocket.send(request);
      }

    } catch (SocketException e) {
      System.out.println("Socket: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO: " + e.getMessage());
    } finally {
      if (aSocket != null)
        aSocket.close();
    }
  }
}
