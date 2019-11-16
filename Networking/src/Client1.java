import java.io.*;
import java.net.*;

/**
 * Simple Java program for Client,Server Connectivity
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Client1 {

	public static void main(String[] args) 
	{
		try
		{
			Socket s=new Socket("192.168.100.254",4444);
			InputStream is=s.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			String mes=dis.readLine();
			System.out.println("Server message is:"+mes);
			dis.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
