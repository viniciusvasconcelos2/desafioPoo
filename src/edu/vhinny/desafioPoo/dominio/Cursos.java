package edu.vhinny.desafioPoo.dominio;

public abstract class Cursos extends Conteudo{
    @Override
    public double calcularXP(){
        return XP_PADRAO*cargaHoraria;
    }
    private int cargaHoraria;

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
