import org.example.Ex1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testEx1 {



    @Test
    public void testSoma() {
        Ex1 calculo = new Ex1();
        int soma = calculo.soma(2,5);
        int testSoma = 7;
        assertEquals (soma, testSoma, "Erro no calculo da soma!");
    }
}

