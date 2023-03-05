package Ejercicio1;

import java.util.Scanner;

public class ElMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer valor:");
        int valor1 = teclado.nextInt();

        System.out.println("Ingrese el segundo valor:");
        int valor2 = teclado.nextInt();

        if (valor1 > valor2) {
            System.out.println("El mayor es: " + valor1);
        } else {
            System.out.println("El mayor es: " + valor2);
        }

        System.out.println("Escriba otro valor real:");
        double valor3 = teclado.nextDouble();
        System.out.println("Escriba el siguiente valor real:");
        double valor4 = teclado.nextDouble();

        if (valor3 == valor4){
            System.out.println("0");
        } else if (valor3 > valor4) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
        }
    }

