package edu.vhinny.exercicios;

import java.util.Scanner;

public class Ex5Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//primeiro abre o fluxo do scanner
        int numero;
        int resultado;
        int contador = 1;
        System.out.println("você quer saber a tabuada de qual número?");
        numero = scan.nextInt();
        do {
            resultado = numero * contador;
            System.out.println(numero + "x" + contador + " = " + resultado);
            contador = contador + 1;
        }
        while (contador < 11);
    }
}
