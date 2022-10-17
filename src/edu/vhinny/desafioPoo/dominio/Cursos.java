package edu.vhinny.desafioPoo.dominio;

public  class Cursos extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXP(){
        return XP_PADRAO*cargaHoraria;
    }


    public Cursos() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
