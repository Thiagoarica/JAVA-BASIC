package oo.Herança.Desafio;

public class Ferrari extends Carro implements Esportivo {
    @Override
    void acelerar() {
        velocidadeAtual+= 20;
    }
    public void ligarTurbo(){
        velocidadeAtual=35;
    }
    public void desligarTurbo(){
        velocidadeAtual=15;
    }
}
