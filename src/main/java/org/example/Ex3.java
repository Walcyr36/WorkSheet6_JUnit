package org.example;

public class Ex3 {

    public int area(int base, int altura) {
        return base * altura;
    }

    public int perimetro(int base, int altura) {
        return 2*(base+altura);
    }

    public boolean isTriangle(int a, int b, int c) {
        if( a<(c+b) && b < (c+a) && c <(a+b)) {
            return true;
        }else {
            return false;
        }
    }
}


