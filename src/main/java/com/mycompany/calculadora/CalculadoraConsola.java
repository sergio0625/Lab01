package com.mycompany.calculadora;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CalculadoraConsola {
    public  CalculadoraConsola(){
        CalculadoraConsola();
    }    
    private void CalculadoraConsola(){
            System.out.println("CALCULADORA DE CONSOLA");
    /*----------------------------------------------------------*/
             Scanner entrada = new Scanner(System.in);
        double numero1, numero2, resultado;
        String operador;

        System.out.println("Calculadora básica en Java con Regex");
        System.out.print("Ingrese el primer número: ");
        numero1 = entrada.nextDouble();

        System.out.print("Ingrese un operador (+, -, *, /): ");
        operador = entrada.next();

        while (!Pattern.matches("[+\\-*/]", operador)) {
            System.out.print("Operador no válido. Por favor ingrese un operador válido (+, -, *, /): ");
            operador = entrada.next();
        }

        System.out.print("Ingrese el segundo número: ");
        numero2 = entrada.nextDouble();

        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero");
                }
                break;
            default:
                System.out.println("Operador no válido");
        }
            
        }
}
