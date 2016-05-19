import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;


public class IPAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet);
		System.out.println(inet.getHostAddress());
		System.out.println(inet.getHostName());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Host Name");
		String hostName = scanner.next();
		InetAddress array [] = InetAddress.getAllByName(hostName);
		for(InetAddress i : array){
			System.out.println(i);
		}
		scanner.close();
	}

}
