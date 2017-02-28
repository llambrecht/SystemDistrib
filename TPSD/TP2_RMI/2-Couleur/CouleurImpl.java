import java.rmi.server.UnicastRemoteObject ;
import java.rmi.RemoteException ;

public class CouleurImpl 
  extends UnicastRemoteObject
  implements Couleur
{  
	private int R;
	private int G;
	private int B;
	
	public CouleurImpl ()
	throws RemoteException
	{
		super() ;
		R=255;
		G=255;
		B=255;
	} ;
	
	public void setRGB(int a, int b, int c){
		this.R=a;
		this.G=b;
		this.B=c;
	}

	public String RGB()
	throws RemoteException
	{
		return("R :" + R + " G :" + G + " B :" + B);
	}
	
	public String CMJ()
	throws RemoteException
	{
		return("C :" + (255-R) + "M  : "+ (255-G) + "J :" + (255-B)); 
	}
}
