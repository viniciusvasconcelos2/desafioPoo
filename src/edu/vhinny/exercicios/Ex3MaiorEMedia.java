package edu.vhinny.exercicios;

import java.util.Scanner;

public class Ex3MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//primeiro abre o fluxo do scanner
        int maior = 0;
        int[] numero= new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("digite um número");
            numero[i] = scan.nextInt();
            if (maior < numero[i]) {
                maior = numero[i];
            }

        }
        System.out.println("o maior valor é: "+maior);
        System.out.println("a média é:  " + ((numero[0] + numero[1] + numero[2] + numero[3] + numero[4]) / 5));
    }
}