package com.mycompany.calculadora;


import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculadoraGrafica {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JPanel Panel;
    JFrame Ventana;
    TextField TxtPantalla;
    public  CalculadoraGrafica(){
        VentanaPanel();
        Buttons();
        TxtPantalla();
    }                
    private void VentanaPanel(){
        Ventana = new JFrame("Calculadora Grafica");
        Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(0, 0, 300, 400); 
        Ventana.setLayout(null);
        Ventana.add(Panel);
        Ventana.setLocationRelativeTo(null);
        Ventana.setSize(300, 400);        
        Ventana.setVisible(true);
    }
     private void TxtPantalla(){
       TxtPantalla= new TextField(" ");
       TxtPantalla.setBounds(10,10,270, 50);
      // TxtPantalla.setBounds(0, 0, 200, 100); 
       Panel.add(TxtPantalla);
    }
     
    private void Buttons(){
        b1=new JButton("1"); b1.setBounds(10,70,35, 35);      
        b2=new JButton("2"); b2.setBounds(10,110,35, 35);
        b3=new JButton("3"); b3.setBounds(10,150,35, 35);
        b4=new JButton("4"); b4.setBounds(50,70,35, 35);
        b5=new JButton("5"); b5.setBounds(50,110,35, 35);
        b6=new JButton("6"); b6.setBounds(50,150,35, 35);
        b7=new JButton("7"); b7.setBounds(90,70,35, 35);
        b8=new JButton("8"); b8.setBounds(90,110,35, 35);
        b9=new JButton("9"); b9.setBounds(90,150,35, 35);
        b0=new JButton("0"); b0.setBounds(130,0,35, 70);
        //organizar los botones en la pantalla
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
