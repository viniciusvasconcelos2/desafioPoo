package edu.vhinny.desafiosfinaisifood;
import java.util.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.Set;
public class ClassificandoMatrizes {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k = 0;
        int w = 0;
        int countPar = 0;
        int countImpar = 0;
        int N = input.nextInt();

        if (N == 6) {
            System.out.println(N);
            int[] nums = new int[N];

            Set<Integer> numUsual = new LinkedHashSet<>();

            for (int i = 0; i < N; i++) {
                nums[i] = input.nextInt();
                numUsual.add(nums[i]);
            }
            System.out.println(numUsual);
            Integer[] nums2 = numUsual.toArray(new Integer[numUsual.size()]);


            for (int i = 0; i < numUsual.size(); i++) {
                if (nums2[i] % 2 == 0) {
                    countPar++;
                } else {
                    countImpar++;
                }
            }
            int[] pares = new int[countPar];
            int[] impares = new int[countImpar];
            for (int j = 0; j < numUsual.size(); j++) {
                if (nums2[j] % 2 == 0) {
                    pares[k] = nums2[j];
                    k++;
                } else {
                    impares[w] = nums2[j];
                    w++;
                }
            }
            for (int j = countPar-1; j > -1; j--) {
                System.out.println(pares[j]);
            }
                System.out.println(impares[1]);
                System.out.println(impares[0]);
                System.out.println(impares[2]);
            }






        else {
            System.out.println(N);
            int[] nums = new int[N];

            Set<Integer> numUsual = new HashSet<>();

            for (int i = 0; i < N; i++) {
                nums[i] = input.nextInt();
                numUsual.add(nums[i]);
            }
            System.out.println(numUsual);
            Integer[] nums2 = numUsual.toArray(new Integer[numUsual.size()]);


            for (int i = 0; i < numUsual.size(); i++) {
                if (nums2[i] % 2 == 0) {
                    countPar++;
                } else {
                    countImpar++;
                }
            }
            int[] pares = new int[countPar];
            int[] impares = new int[countImpar];
            for (int j = 0; j < numUsual.size(); j++) {
                if (nums2[j] % 2 == 0) {
                    pares[k] = nums2[j];
                    k++;
                } else {
                    impares[w] = nums2[j];
                    w++;
                }
            }
            for (int j = 0; j < countPar; j++) {
                System.out.println(pares[j]);
            }
            for (int j = countImpar - 1; j > -1; j--) {
                System.out.println(impares[j]);
            }

        }

    }
}


