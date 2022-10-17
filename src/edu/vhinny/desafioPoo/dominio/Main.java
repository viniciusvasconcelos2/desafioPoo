package edu.vhinny.desafioPoo.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cursos curso1 = new Cursos();
        //Cursos curso1_1 = new Cursos();
        curso1.setTitulo("Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);


        Cursos curso2 = new Cursos();
        //Cursos curso2_1 = new Cursos();
        curso2.setTitulo("javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        //Mentoria mentoria1_1 = new Mentoria();
        mentoria1.setTitulo("mentoria");
        mentoria1.setDescricao("descricao curso mentoria");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java dev");
        bootcamp.setDescricao("Descrição bootcamp java dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev deVhinny = new Dev();
        deVhinny.setNome("deVhinny");
        deVhinny.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Vhinny"+ deVhinny.getConteudosInscritos());

        deVhinny.progredir();
        deVhinny.progredir();
        System.out.println("Conteudos Inscritos Vhinny"+ deVhinny.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Vhinny"+ deVhinny.getConteudosConcluidos());
        System.out.println("XP:" + deVhinny.calcularTotalXp());

        Dev devJoao = new Dev();
        deVhinny.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João"+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Inscritos João"+ devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos João"+ devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());




    }
}
