package edu.vhinny.smartv;

public class SmartTv {


    public static void main(String[] args) {

        boolean estadoTv = false;
        boolean botaoLigaDesliga = true ;


        if (botaoLigaDesliga == true && estadoTv == false) {
            estadoTv = true;

        }
        else if (botaoLigaDesliga == true && estadoTv == true) {
            estadoTv = false;

        }
        System.out.println("estado da tv é :" + estadoTv);
    }
}
/*
    public boolean mudarCanal (){

    }
    public boolean mudarVolume (){

    }
}
*/