package co.edu.sena.opp_2902274;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        System.out.println("Suma de números");
        
        System.out.println("Ingrese un primer número: ");
        Scanner src= new Scanner (System.in);
        int number1 = src.nextInt();

        System.out.println("Ingrese un segundo número: ");
        int number2 = src.nextInt();

        int result = number1 + number2;
        System.out.println("El resultado de la operación es: " +result);


     

    }
}
