package version0;

/*  The java.net package contains the basics needed for network operations. */
import java.net.*;

/* The java.io package contains the basics needed for IO operations. */
import java.io.*;

public class Client 
{
	public static void main(String[] args) throws IOException {
		/** Define a host server */
		String host = "localhost"; //127.0.0.1 
		/** Define a port */
		int port = 4200;

		StringBuffer instr = new StringBuffer();
		String TimeStamp;
		System.out.println("SocketClient initialized");
		Socket connection = null;
		// Requesting a Socket and Establishing a Connection
		/** Obtain an address object of the server */
		InetAddress address;
		try {
			address = InetAddress.getByName(host);
			/** Establish a socket connetion */
			connection = new Socket(address, port);
			/** Instantiate a BufferedOutputStream object */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Writing to the Socket
		BufferedOutputStream bos;
		OutputStreamWriter osw = null;
		try {
			bos = new BufferedOutputStream(connection.getOutputStream());
			osw = new OutputStreamWriter(bos, "US-ASCII");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/** Instantiate an OutputStreamWriter object with the optional character
		 * encoding.
		 */

		TimeStamp = new java.util.Date().toString();
		String process = "Calling the Socket Server on "+ host + " port " + port +
				" at " + TimeStamp +  (char) 13;

		/** Write across the socket connection and flush the buffer */
		osw.write(process);
		osw.flush();


		//Reading from the Socket

		/** Instantiate a BufferedInputStream object for reading
		      /** Instantiate a BufferedInputStream object for reading
		 * incoming socket streams.
		 */

		BufferedInputStream bis = new BufferedInputStream(connection.
				getInputStream());
		/**Instantiate an InputStreamReader with the optional
		 * character encoding.
		 */

		InputStreamReader isr = new InputStreamReader(bis, "US-ASCII");

		/**Read the socket's InputStream and append to a StringBuffer */
		int c;
		while ( (c = isr.read()) != 13)
			instr.append( (char) c);

		/** Close the socket connection. */
		connection.close();
		System.out.println(instr);

	}





}

