package edu.vhinny.colletionsjava;


import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        //List<Double> notas = Arrays.asList(7d,8,5,9.3,5d,7d,0d,3.6);//não permite inserir nem retirar elementos
        System.out.println("Crie uma lista e adicione as setes notas");
        List<Double> notas = new ArrayList<>();//generics e diamond operator dessa linha não é recomendado
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5d));
        System.out.println("Exiba a posição da nota 8.0 na posição 4");
        notas.add(4,8.0);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela 6.0");
        notas.set(notas.indexOf(5d),6.0);
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 está na lista ( "+ notas.contains(5d)+" )");
        System.out.println("Exiba todas as notas na ordem que foram imformadas");
        for (Double nota : notas) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada: "+notas.get(2));
        System.out.println(notas);
        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));
       // System.out.println("Exiba a soma dos valores: ");
        Iterator <Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("Exiba a soma dos valores: "+soma);
        System.out.println("Exiba a soma dos valores: "+(soma/notas.size()));
        System.out.println("remova a nota 0 ");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("remova a nota na posição 0 ");
        notas.remove(0);
        System.out.println(notas);
        System.out.println("remova as notas menores que 7");
        Iterator <Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()) {
            Double next = iterator1.next();
               //this.notas.removeIf(next<7);         //collection1.removeIf(7);

            //.removeIf(next<7);
            //iterator1.removeIf(next<7);

            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("apague toda a lista");
        notas.clear();
        System.out.println(notas);
        System.out.println("confira se a lista está vazia ( "+ notas.isEmpty()+" )");







    }
}
