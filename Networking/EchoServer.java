import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer
{
	
			
		
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(9999);
	
		try
		{
			while (true)
			{
				Socket client = server.accept();
				BufferedReader r = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter w = new PrintWriter(client.getOutputStream(), true);
				w.println("Welcome to the Java EchoServer.  Type 'bye' to close.");
				String line;
				do
				{
					line = r.readLine();
					if ( line != null )
						w.println("Got: "+ line);
				}
				while ( !line.trim().equals("bye") );
				client.close();
			}
		}
		catch (Exception err)
		{
			System.err.println(err);
		}
	}

	

	
}