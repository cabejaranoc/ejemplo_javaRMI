/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author crist
 */
public interface Calculadora extends Remote{
    public int div(int a, int b) throws RemoteException;
    public int mul(int a, int b) throws RemoteException;
    public int sum(int a, int b) throws RemoteException;
    public int res(int a, int b) throws RemoteException;
}
