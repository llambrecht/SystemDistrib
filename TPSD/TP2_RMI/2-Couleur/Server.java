import java.net.* ;
import java.rmi.* ;

public class Server
{
  public static void main(String [] args)
  {
    if (args.length != 1)
    {
      System.out.println("Usage : java Serveur <port du rmiregistry>") ;
      System.exit(0) ;
    }
    try
    {
      CouleurImpl objLocal = new CouleurImpl () ;
      Naming.rebind( "rmi://localhost:" + args[0] + "/CouleurImpl" ,objLocal) ;
      System.out.println("Serveur pret") ;
    }
    catch (RemoteException re) { System.out.println(re) ; }
    catch (MalformedURLException e) { System.out.println(e) ; }
  }
}
