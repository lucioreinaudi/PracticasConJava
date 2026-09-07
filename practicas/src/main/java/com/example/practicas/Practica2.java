//1. Escribir `esMayorDeEdad(int edad)` que devuelva un `boolean`
//2. Escribir `calcularDescuento(double precio, double porcentaje)` que devuelva el precio final con el descuento
//3. Escribir `categoria(int edad)` que devuelva un `String`: `"niño"`, `"adolescente"` o `"adulto"`
//4. Probar las tres desde `main` con al menos dos valores distintos cada una

package com.example.practicas;
import java.util.Scanner;

public class Practica2 {

    public static boolean esMayorDeEdad(int edad) {
        if (edad >= 18){} return true;
    }

    public static double calcularDescuento (double precio, double porcentaje) {
        return precio - (precio * (porcentaje/100));
    }

    public static Categoria categoria (int edad){
        if (edad < 13) {
            return Categoria.NINO;
        } else if (edad < 18)  {
            return Categoria.ADOLESCENTE;
        } else {
            return Categoria.ADULTO;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresá el precio del producto: ");
            double precio = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingresa el porcentaje de descuento: ");
            double porcentaje = Double.parseDouble(scanner.nextLine());

            double descuento = calcularDescuento(precio, porcentaje);
            System.out.println(descuento);

            System.out.println("Aca decime la edad gato:");
            int edad = Integer.parseInt(scanner.nextLine());
            Categoria catesixseven = categoria(edad);
            System.out.println(catesixseven);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida — ingresá solo números");
        }
    }
}