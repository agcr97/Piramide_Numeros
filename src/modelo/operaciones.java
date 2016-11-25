/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 * Angel Córdova 15:11 25-11-2016
 */
public class operaciones {
    public int lim;

    public operaciones(int lim) {
        this.lim = lim;
    }

    public int getLim() {
        return lim;
    }

    public void setLim(int lim) {
        this.lim = lim;
    }
    
    public void piramide_pabajo(){
        String salida = "";
        int num = 1;
        for(int i=1;i<=lim;i++){
            for(int j=1;j<=i;j++){
                salida = num + " " + salida;
            }
            num += 1;
            salida = "\n" + salida;
        }
        JOptionPane.showMessageDialog(null,salida);
    }
    
}
