import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class URLDemo {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.flipkart.com");
		URLConnection con = url.openConnection();
		con.connect();
		InputStream is = con.getInputStream();
		int singleByte = is.read();
		while(singleByte!=-1){
			System.out.print((char)singleByte);
			singleByte = is.read();
		}
		is.close();
		
		

	}

}
