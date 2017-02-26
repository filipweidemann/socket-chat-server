import java.io.IOException;
import java.net.ServerSocket;

public class Main {
	
	public static void main(String[] args) throws IOException{
		SimpleServer myServer = new SimpleServer();
		while(true){
			myServer.writeSocketContent();
		}
		
	}
	
}
