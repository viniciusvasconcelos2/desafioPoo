package edu.vhinny.desafios;

import java.util.Scanner;

public class SaoIguais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        a = scan.nextInt();
        b = scan.nextInt();
        if (a==b) {
            System.out.println("Sao Iguais!");
        }
        else {
            System.out.println("Nao Sao iguais!");
        }
    }
}
