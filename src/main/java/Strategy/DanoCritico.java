package Strategy;

public class DanoCritico implements EstrategiaDano {

    public int calcular(int dado, int modificador) {
        return (dado * 2) + modificador;
    }
}