package edu.vhinny.desafioPoo.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Conteudo curso1 = new Cursos();
        Cursos curso1_1 = new Cursos();
        curso1.setTitulo("Java");
        curso1.setDescricao("descricao curso java");
        curso1_1.setCargaHoraria(8);


        Conteudo curso2 = new Cursos();
        Cursos curso2_1 = new Cursos();
        curso2.setTitulo("javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2_1.setCargaHoraria(4);

        Conteudo mentoria1 = new Mentoria();
        Mentoria mentoria1_1 = new Mentoria();
        mentoria1.setTitulo("mentoria");
        mentoria1.setDescricao("descricao curso mentoria");
        mentoria1_1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
}
