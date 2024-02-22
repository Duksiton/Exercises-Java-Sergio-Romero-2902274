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
        System.out.println("Area de un triangulo");

        System.out.println("Ingrese la base");
        Scanner src = new Scanner(System.in);

        double base = src.nextDouble();
        System.out.println("Ingrese la altura");

        double height = src.nextDouble();
        double result = (base * height) / 2;

        System.out.println("El area del triagunlo es: " + result);
    }

    static void sum() {
        System.out.println("Suma de números");

        System.out.println("Ingrese un primer número: ");
        Scanner src = new Scanner(System.in);
        int number1 = src.nextInt();

        System.out.println("Ingrese un segundo número: ");
        int number2 = src.nextInt();

        int result = number1 + number2;
        System.out.println("El resultado de la operación es: " + result);
    }

    static void raise() {
        System.out.println("Número elevado al cuadrado");

        System.out.println("Ingrese el número que desea elevar: ");
        Scanner src = new Scanner(System.in);

        int number = src.nextInt();

        int result = number * number;
        System.out.println("El número elevado es: " + result);
    }

    static void converter() {
        System.out.println("Convertidor de euros a dólares");

        System.out.println("Ingrese el valor que desea convertir: ");
        Scanner src = new Scanner(System.in);
        int value = src.nextInt();

        double result = value* 1.08;

        System.out.println("Su valor de " + value + " euros " + "equivale a: " + result + " dólares");
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