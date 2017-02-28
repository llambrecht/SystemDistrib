import java.rmi.Remote ; 
import java.rmi.RemoteException ; 

public interface Couleur extends Remote
{
	public String RGB()
		throws RemoteException;
	
	public String CMJ()
		throws RemoteException;
}
