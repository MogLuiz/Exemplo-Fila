package Fila;

public class Banco {
    public static void main (String [] args){
        Fila f;
        int e;
        f = new Fila();
        f.inserir(170);
        f.inserir(200);
        f.inserir(215);
        f.inserir(390);
        f.inserir(400);
        System.out.println("***** Atendimento *****");
        while (!f.isEmpty()){
            e = f.retirar();
            System.out.println("Senha a sert atendida no guiche " + e);
        }



    }

}
