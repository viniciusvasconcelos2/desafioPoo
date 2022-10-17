package edu.vhinny.desafios;

import java.util.Scanner;

public class SomatorioRecursividade {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();


        System.out.println(SomatorioRecursividade.somatorio(numero));
    }

    /*
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {

        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
