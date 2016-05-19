import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient
{
	public static void main(String[] args)
	{
		try
		{
			Socket s = new Socket("localhost", 9999);
			BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter w = new PrintWriter(s.getOutputStream(), true);
			Scanner scanner = new Scanner(System.in);
			String line;
			do
			{
				line = r.readLine();
				if ( line != null )
					System.out.println(line);
				System.out.println("Enter the Your Msg");
				line = scanner.nextLine();
				w.println(line);
			}
			while ( !line.trim().equals("bye") );
		}
		catch (Exception err)
		{
			System.err.println(err);
		}
	}
}
