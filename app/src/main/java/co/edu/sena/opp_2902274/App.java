package co.edu.sena.opp_2902274;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App
{
public static void main( String[] args )
{
System.out.println("Área de un triángulo");
System.out.println("Ingrese la base");
Scanner src= new Scanner (System.in);
double base = src.nextDouble();

System.out.println("Ingrese la altura");
double height = src.nextDouble();

double result = (base * height)/2;
System.out.println("El area del triangulo es: " + result);
}
}