//Práctica 3 / Bucles

//1. Con un `for`, imprimir la tabla del 7 (7x1 hasta 7x10)
//2. Con un `while`, sumar los números del 1 al 100 y mostrar el total
//3. Combinar con lo de Práctica 2: recorrer del 1 al 20 e imprimir la `categoria()` de cada número usado como edad

package com.example.practicas;
import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("valor de i " + i);
            System.out.println("Tabla de 7: " + i*7);
        }

        int contador = 0;
        int acumulador = 0;

        while (contador<=99){
            contador += 1;
            System.out.println(contador);
            acumulador = contador + acumulador;
            System.out.println(acumulador);
        }

        for (int i = 1; i <= 20; i++){

            if (i < 13) {
                System.out.println("NINO");
            } else if (i < 18)  {
                System.out.println("ADOLESCENTE");
            } else {
                System.out.println("ADULTO");
            }
        }
    }


}