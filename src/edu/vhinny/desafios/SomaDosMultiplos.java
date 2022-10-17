package edu.vhinny.desafios;
import java.util.Scanner;
public class SomaDosMultiplos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, n,resultado;
        int soma = 0;
        int contador = 1;

        a = input.nextInt();
        n= input.nextInt();
        do {
            resultado = a * contador;
            soma = soma + resultado;
            contador++;
            System.out.println(soma);
            System.out.println(resultado);
        }
        while (resultado<n);
System.out.println(soma);
        }
    }
