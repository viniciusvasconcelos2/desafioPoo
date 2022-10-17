package edu.vhinny.exercicios;

import java.util.Scanner;

public class Ex6fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//primeiro abre o fluxo do scanner
        int numero;

        int resultado=1;
       // int fatorial=1;
        int fator;
        int i = 0;
        System.out.println("você quer saber o fatorial  de qual número?");
        numero = scan.nextInt();
        do {
            fator = numero-i;
            //System.out.println(fator);
            resultado = resultado*fator;
            //System.out.println(resultado);
            i++;

                    }
        while (fator > 1);
        System.out.println( "o fatorial de "+numero+ " é "+ resultado);
    }
}

