package org.example;

public class Ex6 {

    public int digitos(int numero) {
        int contador = 0;

        while(numero != 0) {
            numero = numero / 10;
            contador++;
        }

        return contador;
    }

    public int somaDigitos(int numero) {
        int soma = 0;

        while(numero != 0) {
            soma = soma + numero % 10;
            numero = numero / 10;
        }

        return soma;
    }

    public float media(int numero) {
        float contador = (float) digitos(numero);
        float soma = (float) somaDigitos(numero);

        return soma /contador;
    }
}
