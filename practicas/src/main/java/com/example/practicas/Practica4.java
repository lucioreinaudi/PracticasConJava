//Práctica 4 / ArrayList

//1. Crear un `ArrayList<String>` y cargar 5 nombres
//2. Recorrerlo con for-each e imprimir cada nombre en mayúsculas (`nombre.toUpperCase()`)
// 3. Buscar si `"Ana"` está en la lista con `contains()` e imprimir el resultado
//4. Eliminar el segundo nombre agregado y mostrar la lista final con `size()` actualizado

package com.example.practicas;
import java.util.ArrayList;

public class Practica4 {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Sofia");
        nombres.add("Lucas");

        System.out.println("Cantidad de nombres en la lista: " + nombres.size());

        System.out.println("Lista final: " + nombres);

        for (String n : nombres) {
            System.out.println(n.toUpperCase());
        }

        for (String n : nombres) {
            System.out.println(n.contains("Ana"));
        }

        nombres.remove(1);

        System.out.println("Cantidad de nombres en la lista: " + nombres.size());

        System.out.println("Lista final: " + nombres);
    }
}
