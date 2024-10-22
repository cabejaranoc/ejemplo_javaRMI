/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Cliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Registry miRegistro = LocateRegistry.getRegistry("localhost", 1099);
            Calculadora c = (Calculadora) Naming.lookup("//localhost/Calculadora");
            while (true) {
                String menu = JOptionPane.showInputDialog("Calculadora básica con JAVA RMI \n"
                        + "Selecciones las isguientes opciones \n 1. División \n 2.Multiplicación \n 3. Resta \n 4.Suma \n"
                        + "Clic en el botón cancelar para salir...");

         switch(menu){   
         case "1":{
         int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a dividir"));
         int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a dividir"));
         JOptionPane.showMessageDialog(null,"la división es: "+c.div(x,y));
                
         break;}
            
        case "2":{
         int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a multiplicar"));
         int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a multiplicar"));
         JOptionPane.showMessageDialog(null,"la multiplicación es: "+c.mul(x,y));
                
         break;}
         
         case "3":{
         int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a restar"));
         int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a restar"));
         JOptionPane.showMessageDialog(null,"la resta es: "+c.res(x,y));
                
         break;}case "4":{
         int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a sumar"));
         int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a sumar"));
         JOptionPane.showMessageDialog(null,"la suma es: "+c.sum(x,y));
                
         break;}
            }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Servidor no conectado: "+e);
        }
    }

}
