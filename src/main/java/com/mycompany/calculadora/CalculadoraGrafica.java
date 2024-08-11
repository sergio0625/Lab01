package com.mycompany.calculadora;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculadoraGrafica {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JPanel Panel;
    JFrame Ventana;
    public  CalculadoraGrafica(){
        VentanaPanel();
        Buttons();
    }                
    private void VentanaPanel(){
        Ventana = new JFrame("Calculadora Grafica");
        Panel = new JPanel(new GridLayout(4, 3));
        Panel.setBounds(0, 0, 300, 400); 
        Ventana.setLayout(null);
        Ventana.add(Panel);
        Ventana.setLocationRelativeTo(null);
        Ventana.setSize(300, 400);        
        Ventana.setVisible(true);
    }
    private void Buttons(){
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        /*organizar los botones en la pantalla*/
        Panel.add(b1);
        Panel.add(b2);
        Panel.add(b3);
        Panel.add(b4);
        Panel.add(b5);
        Panel.add(b6);
        Panel.add(b7);
        Panel.add(b8);
        Panel.add(b9);
        Panel.add(b0);
    }
}
