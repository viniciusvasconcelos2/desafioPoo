package edu.vhinny.desafiosfinaisifood;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuadradoPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> quadrados = new ArrayList<>();
        quadrados.add(1);
        quadrados.add(4);
        quadrados.add(9);
        List<Integer> somas1 = new ArrayList<>();
        List<Integer> somas2 = new ArrayList<>();
        List<Integer> somas3 = new ArrayList<>();
        somas1.add(quadrados.get(0));
        somas3.add(quadrados.get(0) * 3);
        somas2.add(quadrados.get(0) * 2);
        somas1.add(quadrados.get(1));
        somas3.add(quadrados.get(1) * 3);
        somas2.add(quadrados.get(1) * 2);
        somas1.add(quadrados.get(2));
        somas3.add(quadrados.get(2) * 3);
        somas2.add(quadrados.get(2) * 2);
        somas2.add(quadrados.get(0) + quadrados.get(1));
        somas2.add(quadrados.get(0) + quadrados.get(2));
        somas2.add(quadrados.get(1) + quadrados.get(2));
        somas3.add(quadrados.get(0) + quadrados.get(1) + quadrados.get(2));
        somas3.add(quadrados.get(0) + quadrados.get(1) + quadrados.get(1));
        somas3.add(quadrados.get(0) + quadrados.get(2) + quadrados.get(2));
        somas3.add(quadrados.get(1) + quadrados.get(2) + quadrados.get(2));
        System.out.println(quadrados);
        System.out.println(somas1);
        System.out.println(somas2);
        System.out.println(somas3);
        System.out.println(QuadradoPerfeito.teste(somas1,somas2,somas3,n));

    }
        public static int teste(List somas1,List somas2,List somas3,int n){
        if (somas1.contains(n)){
            return 1;
        }
        else if(somas2.contains(n) ){
                return 2;
            }
            else{
                return 3;
                }
            }
    }

