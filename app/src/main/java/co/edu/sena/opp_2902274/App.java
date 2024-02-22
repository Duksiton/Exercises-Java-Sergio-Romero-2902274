package co.edu.sena.opp_2902274;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App

{
    public static void main(String[] args) {
        System.out.println("-------- MENÚ DE OPCIONES --------");
        System.out.println("Escoge alguna de las siguientes opciones");
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("2. Suma de dos números");
        System.out.println("3. Número elevado al cuadrado");
        System.out.println("4. Convertidor de euros a dólares");
        System.out.println("5. Lado de un cuadrado mostrando el valor del área y del perímetro");
        System.out.println("6. Área y volumen de un cilindro");
        System.out.println("7. Radio de una circunferencia");
        System.out.println("8. Promedio de 3 números");

        System.out.println("Selecciona una opción: ");
        Scanner src = new Scanner(System.in);
        int option = src.nextInt();

        switch (option) {
            case 1:
                area();
                break;
            case 2:
                sum();
                break;
            case 3:
                raise();
                break;
            case 4:
                converter();
                break;
            case 5:
                square();
                break;
            case 6:
                cylinder();
                break;
            case 7:
                radio();
                break;
            case 8:
                average();
                break;
        }
    }

    static void area() {

    }

    static void sum() {

    }

    static void raise() {

    }

    static void converter() {

    }

    static void square() {

    }

    static void cylinder() {

    }

    static void radio() {

    }
    static void average() {

    }

}