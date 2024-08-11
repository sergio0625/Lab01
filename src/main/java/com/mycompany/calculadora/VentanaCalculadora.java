package com.mycompany.calculadora;
/*Librerias*/
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaCalculadora extends JFrame{
       /*las partes de la interfaz se crean como ATRIBUTOS*/
    JFrame Ventana;
    JButton Boton1,Boton2;
    JPanel Panel; 
    
    /*CONTRUCTOR*/
    public void metodos(){
        pantalla();
        Buttons();
    }
    private void pantalla(){      
        Ventana = new JFrame("calculadora");
          
        Ventana.setLayout(new FlowLayout());
        Ventana.setVisible(true); 
        Ventana.setBounds(200, 100, 300, 400);       
    }
    private void Buttons(){
        Boton1 = new JButton("Calculadora Consola");
        Boton2 = new JButton("Calculadora Grafica");
        /*posicion del boton en pantalla*/
        Boton1.setBounds(100, 100, 100, 40);
        Boton2.setBounds(200, 200, 100, 40);
        /**/
        //Panel.add(Boton1);
        //Panel.add(Boton2);
        Ventana.add(Boton1);
        Ventana.add(Boton2); 
       
        
        //acciones
        Boton2.addActionListener(new ActionListener() {
            //metodos abstractos
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaGrafica();
            }
        } );               
    }
    
    private void VentanaGrafica(){
             JFrame VentanaCalc= new JFrame("Calculadora Grafica");
            
            VentanaCalc.setLayout(new FlowLayout());
            VentanaCalc.setVisible(true); 
            VentanaCalc.setBounds(300, 200, 300, 400);
            
            /*-----panel-----*/
            Panel= new JPanel( );
            Panel.setLayout(null);
            Panel.setBackground(Color.blue);
            this.getContentPane().add(Panel);
            
    }
}
/*
      private void panel(){
        Panel= new JPanel( );
        Panel.setLayout(null);
        this.add(Panel);        
    }*/