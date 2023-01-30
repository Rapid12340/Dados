package com.company;

import java.util.Random;

public class Dado1 {
    //region Variáveis,getters e setter
    public int Dado_Value;
    public int getDado_Value() {return Dado_Value;}
    public void setDado_Value(int dado_Value) {Dado_Value = dado_Value;}
    //endregion
    //region Metodo
    public void Rolar_a(){
        Random r = new Random();
        this.Dado_Value=r.nextInt(1,7);
    }
    //endregion
}
