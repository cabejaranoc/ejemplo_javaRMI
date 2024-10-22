/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;
import java.rmi.registry.Registry;

/**
 *
 * @author crist
 */
public class Servidor {
    public static void main(String[] args){
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calculadora", new Rmi());
            JOptionPane.showMessageDialog(null, "Conectado al servidor");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No conexion con servidor: " + e);
        }
    }    
}
