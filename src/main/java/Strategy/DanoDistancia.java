package Strategy;

public class DanoDistancia implements EstrategiaDano {

    public int calcular(int dado, int modificador) {
        return dado + modificador;
    }
}