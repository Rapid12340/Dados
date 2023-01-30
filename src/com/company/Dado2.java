package com.company;

import java.util.Random;

public class Dado2 extends Dado1 {
    //region Variáveis,getters e setter
    public int Dado2_Value;
    public int getDado2_Value() {return Dado2_Value;}
    public void setDado2_Value(int dado2_Value) {Dado2_Value = dado2_Value;}
    //endregion
    //region Metodos
    public void Rolar_b(){
        Random r = new Random();
        this.Dado2_Value=r.nextInt(1,7);
    }

    public void Roll_final(){
        Rolar_a();
        System.out.println(Dado_Value);
        Rolar_b();
        System.out.println(Dado2_Value);
        if (Dado_Value > Dado2_Value){
            Roll.RollWithToString valor = Roll.RollWithToString.V1;
            System.out.print(valor);
            System.out.println(Dado_Value);
        }
        else if(Dado2_Value > Dado_Value){
            Roll.RollWithToString valor = Roll.RollWithToString.V2;
            System.out.print(valor);
            System.out.println(Dado2_Value);
        }
        else{
            Roll.RollWithToString valor = Roll.RollWithToString.E;
            System.out.print(valor);
            System.out.println(Dado_Value);
        }
        ONVencedor evento=new ONVencedor(this);
        if(lst!=null)lst.Vencedor_handler(evento);
    }
    //endregion
    //region Listener
    public IVencedor_Listener lst;
    public void set_OnVencedor_Listener(IVencedor_Listener l){
        this.lst=l;
    }
    //endregion
}
