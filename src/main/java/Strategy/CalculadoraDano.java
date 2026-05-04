package Strategy;

public class CalculadoraDano {

    private int dado;
    private int modificador;

    public CalculadoraDano(int dado, int modificador) {
        this.dado = dado;
        this.modificador = modificador;
    }

    public int calcular(EstrategiaDano estrategiaDano) {
        return estrategiaDano.calcular(dado, modificador);
    }
}