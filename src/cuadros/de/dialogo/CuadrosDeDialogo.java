/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadros.de.dialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author jutsu
 */
public class CuadrosDeDialogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        nombre = JOptionPane.showInputDialog("Introduccion de datos", "Teclee su nombre");
        JOptionPane.showMessageDialog(null, "Bienvenido a este programa: " + nombre);
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introducir numeros", "Teclee un entero"));
        JOptionPane.showMessageDialog(null, "El numero introducido fue: " + numero);
    }
    
}
