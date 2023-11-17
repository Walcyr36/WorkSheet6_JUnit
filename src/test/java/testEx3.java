import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testEx3 {


    static org.example.Ex3 calculator;
    @BeforeAll
    public static void setUp() {
        calculator =  new org.example.Ex3();
    }


    @Test
    public void testArea() {

        //First Case
        int area1 = calculator.area(3,5);
        int testArea1= 15;
        assertEquals(area1,testArea1, "Erro no calculo da area");

        // Second Case
        int area2 = calculator.area(5,8);
        int testArea2 = 40;
        assertEquals(area2, testArea2, "Erro no calculo da area");

        // Third Case
        int area3 = calculator.area(2,4);
        int testArea3 = 8;
        assertEquals(area3, testArea3, "Erro no calculo da area");
    }




    @Test
    public void testPerimeter() {

        //First Case
        int perimeter1 = calculator.perimetro(3,5);;
        int testPerimeter1= 16;
        assertEquals(perimeter1,testPerimeter1, "Erro no calculo do perimetro");

        //Second Case
        int perimeter2 = calculator.perimetro(5,8);
        int testPerimeter2 = 26;
        assertEquals(perimeter2, testPerimeter2, "Erro no calculo");

        //Third Case
        int perimeter3 = calculator.perimetro(2,4);
        int testPerimeter3 = 12;
        assertEquals(perimeter3, testPerimeter3, "Erro no calculo do perimetro");
    }



    @Test
    public void testTriangle() {

        assertTrue(calculator.isTriangle(5,5,5));

    }



}
