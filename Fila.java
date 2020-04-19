package Fila;

public class Fila {
    private int [] valores;
    private int inicio;
    private int fim;
    private int total;

    public Fila() {
        valores = new int [10];
        inicio = 0 ;
        fim = 0 ;
        total = 0 ;
    }

    public void inserir(int elemento) {
        valores[fim] = elemento;
        if (fim == 10) {
        fim = 0 ;
        }
        else {
            fim = (fim + 1)  ;
        }
        total ++;
    }

    public int retirar() {
        int elemento = valores[inicio];
        inicio = (inicio + 1) % 10;
        total --;
        return elemento;
    }

    public boolean isEmpty() {
        return (total == 0);
    }
}
