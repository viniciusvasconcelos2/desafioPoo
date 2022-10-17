package edu.vhinny.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex2Notas {
    public static void main(String[] args) {
        /*Scanner.useLocale(Locale.US); /* por setar o locale para US, pode usar ponto, se quiser usar vírgula
        deixa default ou seta PT BR*/
        System.out.println("digite uma nota com valor entre 0 e 10");
        Scanner scan = new Scanner(System.in);

        double nota;
        nota = scan.nextDouble();
            while (nota < 0.0 ||nota > 10.0) {
                System.out.println("valor inválido! digite um valor entre 0 e 10");
                nota = scan.nextDouble();
            }
                System.out.println("nota = " + nota);


            }
        }


