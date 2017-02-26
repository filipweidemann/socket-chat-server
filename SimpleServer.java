import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer{

	private int port;
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;

	public SimpleServer() throws IOException{
		this.port = 1337;
		serverSocket = new ServerSocket(1337);
		clientSocket = serverSocket.accept();
	}

	public SimpleServer(int port) throws IOException{
		this.port = port;
		serverSocket = new ServerSocket(port);
	}

	public void writeSocketContent(String msg) throws IOException{
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		out.println(msg);
	}

	public void readSocketContent() throws IOException {
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		String line;

		while ((line = in.readLine()).length() != 0) {
		    System.out.println(line);
		}

	}

}
