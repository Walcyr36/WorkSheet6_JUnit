import org.example.Ex_3_Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex_3 {


    @Test
    public void testArea() {
        Ex_3_Rectangle calculo = new Ex_3_Rectangle();
        int area = calculo.area(3,5);;
        int testArea= 15;
        assertEquals(area,testArea, "Erro no calculo da area");
    }




    @Test
    public void testPerimeter() {

        Ex_3_Rectangle calculo = new Ex_3_Rectangle();
        int perimetro = calculo.perimetro(3,5);;
        int testPerimeter= 16;
        assertEquals(perimetro,testPerimeter, "Erro no calculo do perimetro");
    }



    @Test
    public void testTriangle() {

        Ex_3_Rectangle calculo = new Ex_3_Rectangle();
        assertTrue(calculo.isTriangle(6,6,6));

    }








}
