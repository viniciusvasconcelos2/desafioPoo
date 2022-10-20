package edu.vhinny.desafiosfinaisifood;

import java.util.Scanner;

public class FatorialDesajeitado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int valor=N;
        int valorM=0;
        int valorD=0;
        int valorSo=0;
        int valorSub=0;
        int i=1;


            FatorialDesajeitado.multiplica(N,valor,i);
            FatorialDesajeitado.divide(N,valorM,i);
            FatorialDesajeitado.soma(N,valorD,i);
            FatorialDesajeitado.subtrai(N,valorSo,i);


        System.out.println(valorSub);


        }
        public static int multiplica(int N,int valor,int i){

        valorM=valor*N-i;
            i++;
            return valorM;


        }
    public static int divide(int N,int valorM,int i){
        valor=valor/N-i;
        i++;
        return valor;


    }
    public static int soma(int N,int valor,int i){
        valor=valor+N-i;
        i++;
        return valor;


    }
    public static int subtrai(int N,int valor,int i){
        valor=valor-(N-i);
        i++;
        return valor;


    }

}
