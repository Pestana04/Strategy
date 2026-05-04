package Strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonagemTest {

    @Test
    void deveCalcularDanoCorpoACorpo() {
        Personagem personagem = new Personagem();

        personagem.calcularDanoCorpoACorpo(8, 3);

        assertEquals(11, personagem.getDano());
    }

    @Test
    void deveCalcularDanoDistancia() {
        Personagem personagem = new Personagem();

        personagem.calcularDanoDistancia(6, 4);

        assertEquals(10, personagem.getDano());
    }

    @Test
    void deveCalcularDanoMagia() {
        Personagem personagem = new Personagem();

        personagem.calcularDanoMagia(12);

        assertEquals(12, personagem.getDano());
    }

    @Test
    void deveCalcularDanoCritico() {
        Personagem personagem = new Personagem();

        personagem.calcularDanoCritico(8, 3);

        assertEquals(19, personagem.getDano());
    }
}