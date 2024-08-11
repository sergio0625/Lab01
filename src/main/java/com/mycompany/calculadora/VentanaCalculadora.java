package com.mycompany.calculadora;
/*Librerias*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaCalculadora extends JFrame{
       /*las partes de la interfaz se crean como ATRIBUTOS*/    
    JFrame Ventana;
    JButton Boton1,Boton2;
    JPanel Panel= new JPanel( );
    int NumButtons= 50*2; 
 /*-----CONSTRUCTOR-----*/
    public void metodos(){
        pantalla();
        Buttons();
        panel();
    }
    private void pantalla(){                     
        Ventana = new JFrame("calculadora");
        Ventana.setLayout(null);             
        Ventana.setVisible(true); 
        Ventana.setSize(300, NumButtons);
        //Ventana.setLocationRelativeTo(null);      
        /*CIERRA LA VENTANA Y TERMINA LA EJECUCION DEL PROGRAMA*/
        Ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   
      private void panel(){     
        //Panel.setLayout(null);
        Panel.setBounds(0, 0, 300, NumButtons);
       Ventana.add(Panel);        
    }
    private void Buttons(){
        Boton1 = new JButton("Calculadora Consola");
        Boton2 = new JButton("Calculadora Grafica");
        /*posicion del boton en pantalla*/
        Boton1.setBounds(100, 200, 100, 40);
        Boton2.setBounds(200, 300, 100, 40);
        /**/
        Panel.add(Boton1);
        Panel.add(Boton2);
                       
        //acciones
        Boton2.addActionListener(new ActionListener() {
            //metodos abstractos       
            @Override
            public void actionPerformed(ActionEvent e) {
                 CalculadoraGrafica CalcGrafica=new CalculadoraGrafica(); 
            }
        } );  
        Boton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculadoraConsola CalcConsola= new CalculadoraConsola();
            }                        
        });
    }                
}
