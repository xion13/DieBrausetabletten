/*package SchaumSpiel;

import java.rmi.Naming;
import java.rmi.NotBoundException;

import java.rmi.RemoteException;

public class Client {
	Interface myClient;
	public static void main(String[] args) throws RemoteException, NotBoundException {
		try {
			//IP via ipconfig auflösen - localhost auf Client-Seite durch IP ersetzen
			Interface clientAdder = (Interface) Naming.lookup("rmi://172.16.1.107:12345/Adder");
			int result = clientAdder.add();
			System.out.println("");

		} catch (Exception e) {
			System.out.println("HelloClient exception: " + e);
		}
	}
}*/
