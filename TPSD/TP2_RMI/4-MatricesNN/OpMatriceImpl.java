import java.rmi.server.UnicastRemoteObject ;
import java.rmi.RemoteException ;
import java.net.InetAddress.* ;
import java.net.* ;
public class OpMatriceImpl 
  extends UnicastRemoteObject
  implements OpMatrice 
{

  public OpMatriceImpl ()
    throws RemoteException 
  {
    super() ;
  } ;

	public boolean isMultOk(int[][] a, int[][] b){
		if(a.length == b[0].length){
			return true;
		}
		return false;
	}

	public int[][] multiplicationMatrice (int [][] a, int [][] b){
		if(!isMultOk(a,b))
			return null;
		
		int[][] res = new int[a.length][a[0].length];
		int i,j;
		for(i = 0; i < a.length; i++){
			for(j=0;j< a[0].length ; j++){
				res[i][j] += a[i][j] * b[j][i];
			}
		}
		return res;
	}

    

}
