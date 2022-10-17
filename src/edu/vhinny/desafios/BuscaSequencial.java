package edu.vhinny.desafios;


import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int valor = leitor.nextInt();
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        System.out.println(BuscaSequencial.busca(elementos,valor));
        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

    }
    static String busca (int [] elementos,int valor){


        for (int i = 0;i <10;i++) {
            if (valor == elementos[i]) {
                return ("Achei " + valor + " na posicao " + i);
            }
        }
        return("Numero "+valor+"  nao encontrado!");


    }
            }
