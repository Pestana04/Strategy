package Strategy;

public class Personagem {

    private int dano;

    public int getDano() {
        return dano;
    }

    public void calcularDanoCorpoACorpo(int dadoArma, int modificadorForca) {
        CalculadoraDano calculadora = new CalculadoraDano(dadoArma, modificadorForca);
        this.dano = calculadora.calcular(new DanoCorpoACorpo());
    }

    public void calcularDanoDistancia(int dadoArma, int modificadorDestreza) {
        CalculadoraDano calculadora = new CalculadoraDano(dadoArma, modificadorDestreza);
        this.dano = calculadora.calcular(new DanoDistancia());
    }

    public void calcularDanoMagia(int dadoMagia) {
        CalculadoraDano calculadora = new CalculadoraDano(dadoMagia, 0);
        this.dano = calculadora.calcular(new DanoMagia());
    }

    public void calcularDanoCritico(int dadoArma, int modificador) {
        CalculadoraDano calculadora = new CalculadoraDano(dadoArma, modificador);
        this.dano = calculadora.calcular(new DanoCritico());
    }
}