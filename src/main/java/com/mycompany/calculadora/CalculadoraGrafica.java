package com.mycompany.calculadora;


import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        //Panel.setBackground(Color.yellow);
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
        int DistanceButtonsy= 50+5;//se multiplica por la posicion del boton contando desde 0
        int DistanceButtonsx=50+5;//se multiplica por la posicion del boton contando desde 0
        b1=new JButton("1"); b1.setBounds(10,70+DistanceButtonsy*3,50, 50);                  Panel.add(b1);   
        b2=new JButton("2"); b2.setBounds(10+DistanceButtonsx,70+DistanceButtonsy*3,50, 50);   Panel.add(b2);
        b3=new JButton("3"); b3.setBounds(10+DistanceButtonsx*2,70+DistanceButtonsy*3,50, 50); Panel.add(b3);
        b4=new JButton("4"); b4.setBounds(10,70+DistanceButtonsy*2,50, 50);                  Panel.add(b4);
        b5=new JButton("5"); b5.setBounds(10+DistanceButtonsx,70+DistanceButtonsy*2,50, 50);   Panel.add(b5);
        b6=new JButton("6"); b6.setBounds(10+DistanceButtonsx*2,70+DistanceButtonsy*2,50, 50); Panel.add(b6);
        b7=new JButton("7"); b7.setBounds(10,70+DistanceButtonsy,50, 50);                  Panel.add(b7);
        b8=new JButton("8"); b8.setBounds(10+DistanceButtonsx,70+DistanceButtonsy,50, 50);   Panel.add(b8);
        b9=new JButton("9"); b9.setBounds(10+DistanceButtonsx*2,70+DistanceButtonsy,50, 50); Panel.add(b9);
        b0=new JButton("0"); b0.setBounds(10+DistanceButtonsx,70+DistanceButtonsy*4,50, 50);  Panel.add(b0);  
        /*BOTONES DE OPERACIONES*/
        JButton Buttonsum= new JButton("+"); Buttonsum.setBounds(10+DistanceButtonsx*3, 70+DistanceButtonsy*3, 50, 50);Panel.add(Buttonsum);
        JButton Buttonrest= new JButton("-");Buttonrest.setBounds(10+DistanceButtonsx*3, 70+DistanceButtonsy*2, 50, 50); Panel.add(Buttonrest);
        JButton Buttonmult= new JButton("*");Buttonmult.setBounds(10+DistanceButtonsx*3, 70+DistanceButtonsy, 50, 50); Panel.add(Buttonmult);
        JButton Buttondiv= new JButton("/");Buttondiv.setBounds(10+DistanceButtonsx*3, 70, 50, 50); Panel.add(Buttondiv);
        JButton Buttondot= new JButton("."); Buttondot.setBounds(10+DistanceButtonsx*2, 70+DistanceButtonsy*4, 50, 50); Panel.add(Buttondot);
        JButton Buttonequal= new JButton("="); Buttonequal.setBounds(10+DistanceButtonsx*3, 70+DistanceButtonsy*4, 50, 50); Panel.add(Buttonequal);
        /*-----funciones EXTRAS-----*/
        
        
        
        
        
        /*-----ACCIONES DE LOS BOTONES-----*/
        /*-----ACCIONES BUTTONS NUMERICOS------*/
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               TxtPantalla.setText(TxtPantalla.getText() + "1");                
            }
        });
         //b2.addActionListener(new ActionListener())
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TxtPantalla.setText(TxtPantalla.getText() + "2");                
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TxtPantalla.setText(TxtPantalla.getText() + "3");    
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TxtPantalla.setText(TxtPantalla.getText() + "4");     
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             TxtPantalla.setText(TxtPantalla.getText() + "5");      
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             TxtPantalla.setText(TxtPantalla.getText() + "6");     
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             TxtPantalla.setText(TxtPantalla.getText() + "7");     
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             TxtPantalla.setText(TxtPantalla.getText() + "8");     
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              TxtPantalla.setText(TxtPantalla.getText() + "9");        
            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TxtPantalla.setText(TxtPantalla.getText() + "0");     
            }
        });
        /*-----ACCIONES BUTTONS OPERACIONES-----*/
        Buttonsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TxtPantalla.setText(TxtPantalla.getText() + "+");     
            }
        });
        Buttonrest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             TxtPantalla.setText(TxtPantalla.getText() + "-");     
            }
        });
        Buttonmult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TxtPantalla.setText(TxtPantalla.getText() + "*");     
            }
        });
        Buttondiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TxtPantalla.setText(TxtPantalla.getText() + "/");     
            }
        });
    }
}
 