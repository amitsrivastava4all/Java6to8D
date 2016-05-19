import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9001);
		System.out.println("Server Start....");
	
		Socket socket = server.accept(); // Wait for Client to Come
		System.out.println("Here Comes the Client...");
		OutputStream os = socket.getOutputStream();
		os.write("Hello Client I am Server".getBytes());
		System.out.println("Data Sended...");
		os.close();
		socket.close();
		

	}

}
