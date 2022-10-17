package edu.vhinny.desafioPoo.dominio;

import java.time.LocalDate;

public abstract class Mentoria extends Conteudo{
    @Override
    public double calcularXP(){
        return XP_PADRAO+20d;
    }

    private LocalDate data; //bp: colocar private nos atributs da classe

    public Mentoria() {
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
