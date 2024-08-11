
package com.mycompany.calculadora;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculadoraGrafica {
    public  CalculadoraGrafica(){
        VentanaPanel();
    }            
    
    private void VentanaPanel(){
        JFrame Ventana = new JFrame("Panel en JFrame");
        JPanel Panel = new JPanel();

        Panel.setBounds(0, 0, 300, 400); // Establece la posición (0,0) y el tamaño (300x200) del JPanel

        Ventana.setLayout(null); // Configura el JFrame para utilizar null layout
        Ventana.add(Panel); // Añade el JPanel al JFrame
        Ventana.setSize(300, 400); // Establece el tamaño del JFrame        
        Ventana.setVisible(true);
    }
}
