package co.edu.sena.opp_2902274;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        System.out.println("Número elevado al cuadrado");

        System.out.println("Ingrese el número que desea elevar: ");
        Scanner src= new Scanner (System.in);

        int number = src.nextInt();

        int result= number*number;
        System.out.println("El número elevado es: " +result);
    }
}
