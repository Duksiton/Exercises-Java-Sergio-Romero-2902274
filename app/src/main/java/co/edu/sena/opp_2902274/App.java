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
        System.out.println("Area de un triángulo");

        System.out.println("Ingrese la base");
        Scanner src = new Scanner(System.in);

        double base = src.nextDouble();
        System.out.println("Ingrese la altura");

        double height = src.nextDouble();
        double result = (base * height) / 2;

        System.out.println("El area del triángulo es: " + result);
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
        System.out.println("Lado de un cuadrado que muestre el área y el perímetro");
        System.out.println("Ingrese el lado del cuadrado: ");
        Scanner src = new Scanner(System.in);
        int side = src.nextInt();

        int result = side*side;
        int result2 = 4*side;

        System.out.println("El lado de su cuadrado es de: " + side +"," + " el área es de: " + result +","  + " y el perímetro de: " + result2);
    }

    static void cylinder() {
        System.out.println("Área y volumen de un cilindro");
       
        System.out.println("Ingrese el radio del cilindro: ");
        Scanner src = new Scanner(System.in);
        int radio = src.nextInt();

        System.out.println("Ingrese la altura del cilindro: ");
        int height = src.nextInt();
  
        
        double total_area= 2 * Math.PI * radio * (radio + height);
        double volume = Math.PI * Math.pow(radio, 2) * height;

        System.out.println("El área total es de: " + total_area + " y el volumen es de: " + volume);

    }

    static void radio() {
        System.out.println("Radio de una circunferencia");
       
        System.out.println("Ingrese el radio de la circunferencia: ");
        Scanner src = new Scanner(System.in);
        int radio = src.nextInt();

        double length = 2 * Math.PI * radio;
        double area= Math.PI * Math.pow(radio, 2);

        System.out.println("El radio de la circunferencia es de: " + radio + " la longitud es de " + length + " y el área es de " + area);
    }

    static void average() {
        System.out.println("Promedio de 3 números");

        System.out.println("Ingrese el primer número: ");
        Scanner src = new Scanner(System.in);
        int num1 = src.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = src.nextInt();
        
        System.out.println("Ingrese el tercer número: ");
        int num3 = src.nextInt();

        int result = (num1 + num2 + num3)/3;

        System.out.println("Sus 3 números fueron: " + num1 +", " + num2 +", " + num3 + " y el promedio es de: " + result);
    }

}