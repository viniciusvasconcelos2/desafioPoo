package edu.vhinny.desafiosfinaisifood;

import java.util.Arrays;
import java.util.Scanner;

public class FatorialDesajeitado {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //variáveis e arrays
        int N = input.nextInt();
        int[] fatores = new int[N];
        int i = 0;
        int numOps=N-1;
        int numOpsM=0;
        int numOpsD=0;
        int numOpsS=0;
        int numOpsSub=0;
        int somaOps;
        for(int j =0;j<N;j++){
            fatores[j]= N-i;
            i++;
        }
        System.out.println("vetor de fatores: "+Arrays.toString(fatores));
        while(numOps>0){
            numOpsM++;
            numOps--;
            if(numOps>0){
                numOpsD++;
                numOps--;
            }
            if(numOps>0){
                numOpsS++;
                numOps--;
            }if(numOps>0){
                numOpsSub++;
                numOps--;
            }


        }
        System.out.println("qtd de multiplicações: "+numOpsM);
        System.out.println("qtd de divisões: "+numOpsD);
        System.out.println("qtd de somas: "+numOpsS);
        System.out.println("qtd de subtrações: "+numOpsSub);
        somaOps=numOpsM+numOpsD+numOpsS+numOpsSub;
        System.out.println("total de operações: "+somaOps);
        int[] opM = new int[numOpsM];
        int []opD = new int[numOpsM];
        int []opS = new int[numOpsM];
        int[] opSub = new int[numOpsM];
        int[] resultadoMD = new int[numOpsM];


        /*///////////////////////operações////////////////////////////////////////
        //multiplicações*/
        int passo = 0;
        int passo2 = 2;
        int passo3 = 3;
        int passo4 = 4;
        int p=0;
        for(int j=0;j<numOpsM;j++) {
                opM[j] = fatores[p+passo] * fatores[p + 1+ passo];
                p++;
                passo=passo+3;
        }
        //divisões
        for(int j =0;j<numOpsD;j++){
            opD[j]=fatores[passo2];
            passo2=passo2+4;
        }
        //somas
        for(int j =0;j<numOpsS;j++){
            opS[j]=fatores[passo3];
            passo3=passo3+4;
        }
        //subtrações
        for(int j =0;j<numOpsSub;j++){
            opSub[j]=fatores[passo4];
            passo4=passo4+4;
        }



        System.out.println("vetor de multiplicações: "+Arrays.toString(opM));
        System.out.println("vetor de divisões: "+Arrays.toString(opD));
        System.out.println("vetor de somas: "+Arrays.toString(opS));


        for(int j=0;j<numOpsM;j++){
            if (opD[j]!=0){
                resultadoMD[j] = opM[j]/opD[j];
                            }
            else{
                resultadoMD[j]=opM[j];
            }
                   }
        System.out.println("vetor de multiplicações e divisões: "+Arrays.toString(resultadoMD));
        int resultadoFinal = resultadoMD[0];
        int resultadoSoma = 0;
        int resultadoSub = 0;

           for (int j = 0; j < resultadoMD.length-1 ; j++) {
                opSub[j] =   -1*resultadoMD[j + 1];
                //System.out.println("vetor de subtrações["+j+"]: "+opSub[j]);

            }
        System.out.println("vetor de subtrações"+Arrays.toString(opSub));
           for(int j=0;j<numOpsM;j++){
               resultadoSoma = resultadoSoma+opS[j];
           }
        System.out.println("resultado soma: "+resultadoSoma);
        for(int j=0;j<numOpsM;j++){
            resultadoSub = resultadoSub+opSub[j];
        }
        System.out.println("resultado subtração: "+resultadoSub);
        resultadoFinal=resultadoFinal+resultadoSoma+resultadoSub;
        System.out.println("resultado final das operações: "+resultadoFinal);
        /*//System.out.println(Arrays.toString(opS));
        //System.out.println(Arrays.toString(opSub));*/


    }
}