/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide_numeros_alreves;

import javax.swing.JOptionPane;
import modelo.operaciones;

/**
 *
 * @author lenovo
 * Angel Córdova 15:11 25-11-2016
 */
public class Piramide_numeros_alreves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lim;
        lim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un limite"));
        operaciones objeto1 = new operaciones(lim);
        objeto1.piramide_pabajo();
    }
    
}
