import org.example.Ex6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex6_Test {

    static int numero;
    private Ex6 ex6;
    static int contadorNum;
    static float mediaEsperada;
    static int somaEsperada;

    @BeforeEach
    public void Numeros() {
        ex6 = new Ex6();
        numero = 123456;
    }

    @Test
    public void testDigitos() {
        contadorNum = 6;
        int count = ex6.digitos(numero);
        assertEquals(contadorNum,count,"Error");
    }


    @Test
    public void testSomaDigitos() {
        somaEsperada = 21;
        int soma = ex6.somaDigitos(numero);
        assertEquals(somaEsperada, soma, "Erro");
    }


    @Test
    public void testMedia() {
        mediaEsperada = (float) somaEsperada/contadorNum;
        float media = ex6.media(numero);
        assertEquals(media, media, "Erro");
    }


}
