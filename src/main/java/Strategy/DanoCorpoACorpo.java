package Strategy;

public class DanoCorpoACorpo implements EstrategiaDano {

    public int calcular(int dado, int modificador) {
        return dado + modificador;
    }
}