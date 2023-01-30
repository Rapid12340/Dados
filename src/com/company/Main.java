package com.company;

public class Main {

    public static void main(String[] args) {
        //region Main
        Dado2 P =new Dado2();
        P.Roll_final();
        P.set_OnVencedor_Listener(new IVencedor_Listener() {
            @Override
            public void Vencedor_handler(ONVencedor evt) {
                System.out.print("Vencedor é:");
                if(P.Dado_Value>P.Dado2_Value){
                    System.out.print("O jogaodor 1!");
                }
                else if(P.Dado2_Value>P.Dado_Value){
                    System.out.print("O jogaodor 2!");
                }
                else{
                    System.out.print("Nenhum visto que foi empate!");
                }
            }
        });
        //endregion
    }
}
