package edu.vhinny.exercicios;

import java.util.Scanner;

public class Ex4ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//primeiro abre o fluxo do scanner
        int countPar = 0;
        int countImpar = 0;
        int divisor = 2;
        int[] numero= new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("digite um número");
            numero[i] = scan.nextInt();
            if (numero[i]%divisor==0) {
                System.out.println(numero[i] + " é par");
                countPar= countPar+1;
            }
            else{
                System.out.println(numero[i] + " é ímpar");
                countImpar= countImpar+1;

            }

        }
        System.out.println(" Temos "+ countPar+" número(s) par(es) e "+ countImpar+" número(s) ímpar(es)");


    }
}

