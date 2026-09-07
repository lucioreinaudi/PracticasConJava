//Práctica 5

//1. Crear un `ArrayList<Double>` con al menos 6 notas (0 a 10)
//2. Escribir una función `promedio(ArrayList<Double> notas)` que devuelva el promedio
//3. Escribir una función `aprobados(ArrayList<Double> notas)` que devuelva cuántas son `>= 6`
//4. Recorrer la lista con un bucle e imprimir cada nota junto con `"aprobado"` o `"desaprobado"`
//5. Al final, mostrar el promedio general y el total de aprobados

package com.example.practicas;
import java.util.ArrayList;

public class Practica5 {

    public static double promedio(ArrayList<Double> notas) {

        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.size();
    }


    public static int aprobados(ArrayList<Double> notas) {
        int contador = 0;
        for (double n : notas) {
            if (n >= 6.0) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();

        notas.add(1.0);
        notas.add(2.0);
        notas.add(3.0);
        notas.add(4.0);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(10.0);

        for (double nota : notas) {
            if (nota >= 6.0) {
                System.out.println("Nota: " + nota + " Aprobado");
            } else {
                System.out.println("Nota: " + nota + " Desaprobado");
            }
        }

        double promedioGeneral = promedio(notas);
        System.out.println("Promedio general de notas: " + promedioGeneral);

        int alumnosAprobados = aprobados(notas);
        System.out.println("Cantidad de alumnos aprobados: " + alumnosAprobados);
    }


}
