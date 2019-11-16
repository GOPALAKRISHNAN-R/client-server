import java.io.*;
import java.net.*;

public class Server1 {

	public static void main(String[] args) 
	{
		try
		{
			ServerSocket ss=new ServerSocket(4444);
			System.out.println("Server is ready...."+ss);
			Socket s=ss.accept();
			System.out.println("Send a message to the client....");
			OutputStream out=s.getOutputStream();
			DataOutputStream dos=new DataOutputStream(out);
			dos.writeBytes("Bye");
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
