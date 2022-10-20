package edu.vhinny.desafiosfinaisifood;
import java.util.*;
public class ValidacaoParenteses {


    public static void main(String[] args) {
        //inicializa o scanner
        Scanner scanner = new Scanner(System.in);
        //cria 3 listas de comparação de caractere
        List<Character> listaParenteses = new ArrayList<>();
        List<Character> listaColchetes = new ArrayList<>();
        List<Character> listaChaves = new ArrayList<>();
        //adiciona os caracteres necessários para validação
        listaParenteses.add('(');
        listaParenteses.add(')');
        listaChaves.add('{');
        listaChaves.add('}');
        listaColchetes.add('[');
        listaColchetes.add(']');
        //imprime para conferencia as 3 listas
        System.out.println(listaParenteses);
        System.out.println(listaChaves);
        System.out.println(listaColchetes);

        //adiciona a variável leitura A string scaneada até que de enter
        String leitura = scanner.nextLine();

        System.out.println(leitura);

        System.out.println(leitura.length());
        System.out.println(ValidacaoParenteses.
                ehValido(listaParenteses,listaChaves,listaColchetes,leitura));
    }

    public static boolean ehValido(List listaParenteses, List listaChaves, List listaColchetes, String leitura) {

        if (listaParenteses.contains(leitura.charAt(0)) &
                listaParenteses.contains(leitura.charAt(leitura.length() - 1))) {

            System.out.println(listaParenteses.get(0));
            System.out.println(listaParenteses.get(1));
            return true;

        } else if (listaChaves.contains(leitura.charAt(0)) &
                listaChaves.contains(leitura.charAt(leitura.length() - 1))) {

            System.out.println(listaChaves.get(0));
            System.out.println(listaChaves.get(1));
            return true;

        } else if (listaColchetes.contains(leitura.charAt(0)) &
                listaColchetes.contains(leitura.charAt(leitura.length() - 1))) {
            System.out.println(listaColchetes.get(0));
            System.out.println(listaColchetes.get(1));
            return true;

        } else {
            System.out.println("não válida");
            return false;

        }

    }
}










