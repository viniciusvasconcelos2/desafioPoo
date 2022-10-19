package edu.vhinny.desafiosfinaisifood;
import java.util.Scanner;
import  java.lang.StringBuilder;
public class DesafioPalindromo {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String palavra = sc.nextLine();

        System.out.println(palavra);
                StringBuilder invertida = new StringBuilder(palavra).reverse();
                String inverted = invertida.toString();
        System.out.println(inverted);
                System.out.println(DesafioPalindromo.palindromo(palavra,inverted));
            }

            public static boolean palindromo(String palavra,String inverted){

                if (palavra.equals(inverted)){
                    return true;
                }
                else{
                    return false;
                }
            }

}
