import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException{
		SimpleServer myServer = new SimpleServer();
		Scanner myScanner;
		String write;
		while(true) {
			System.out.println("Wanna send some data man?\n");
			
			write = IO.readString();
			if(write.equals("True")) {
				myServer.writeSocketContent("Moin");
			} else if (write.equals("False")) {
				myServer.readSocketContent();
			} else {
				System.out.println("Only True or False accepted.");
			}
			
		}
		
	}
	
}
