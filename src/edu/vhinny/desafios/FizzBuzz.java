package edu.vhinny.desafios;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
    int numero = teclado.nextInt();
    if ((numero&3)==0|(numero&5)==0){
        System.out.println(numero);
    }
    else {
        System.out.println(FizzBuzz.fizzbuzz(numero));
    }
}

static String fizzbuzz(int numero){
        if (numero%3==0 & numero%5==0) {
            return ("FizzBuzz");
        }
            else if (numero%3==0){
                return ("Fizz");
            }
            else  {
                return ("Buzz");
            }

}


}
