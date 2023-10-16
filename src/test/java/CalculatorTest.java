import org.example.Calculator_Ex1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {



    @Test
    public void testSoma() {
        Calculator_Ex1 calculo = new Calculator_Ex1();
        int soma = calculo.soma(2,5);
        int testSoma = 7;
        assertEquals (soma, testSoma, "Erro no calculo da soma!");
    }
}

