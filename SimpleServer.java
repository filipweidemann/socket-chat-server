import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import jdk.nashorn.internal.ir.WhileNode;

public class SimpleServer{

	private int port;
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private String output;
	
	public SimpleServer() throws IOException{
		this.port = 1337;
		serverSocket = new ServerSocket(1337);
		clientSocket = serverSocket.accept();
	}
	
	public SimpleServer(int port) throws IOException{
		this.port = port;
		serverSocket = new ServerSocket(port);
		clientSocket = serverSocket.accept();
	}
	
	public String writeSocketContent() throws IOException{
		return clientSocket.getOutputStream().toString();
	}
	
	
}
