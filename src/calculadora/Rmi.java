/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
/**
 *
 * @author crist
 */
public class Rmi extends UnicastRemoteObject implements Calculadora{
    public Rmi() throws RemoteException{
        int a, b;
    }
    
    public int div(int a, int b) throws RemoteException{
        return a/b;
    }
    
    public int mul(int a, int b) throws RemoteException{
        return a*b;
    }
    
    public int sum(int a, int b) throws RemoteException{
        return a+b;
    }
    
    public int res(int a, int b) throws RemoteException{
        return a-b;
    }
}
