/*package SchaumSpiel;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RemoteServer;
import java.rmi.server.UnicastRemoteObject;

public class Server
{
  public static void main( String[] args ) throws RemoteException
  {
    
    try {
		
		LocateRegistry.createRegistry(12345);
	    
		 adder = new ();
	    //UnicastRemoteObject.exportObject( adder, 0 ); wird nur benötigt, wenn die Serverimplementierung nicht schon bereits Unicast erweitert. 
	    
	    RemoteServer.setLog( System.out );
	    Naming.rebind("rmi://localhost:12345/Adder", adder);
	    System.out.println( "Adder angemeldet" );
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  }
}*/
