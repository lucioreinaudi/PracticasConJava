package com.example.practicas;

public class Practica1 {

    public static void main(String[] args) {

        //Datos basicos del script
        String nombre = "Lucio";
        int edad = 29;
        double altura = 1.77;
        boolean inscripto = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Inscripto: " + inscripto);

        //Aca calculamos el IMC
        int pesoKG = 70;
        double imc = pesoKG / (altura * altura);
        System.out.printf("IMC: %.2f%n", imc);

        //Y aca convertir a string y concatenar
        String edadTexto = "" + edad;
        System.out.println("Tengo " + edadTexto + " años");
    }

}