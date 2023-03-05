package Ejercicio2;

import java.util.Scanner;

public class MicroGuerra {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] tablero = new int[4][4];

        inicializarTablero(tablero);
        mostrarTablero(tablero);
        introducirEnteroEntreLimites(0, 3);
        disparar(tablero);



    }

    static public void inicializarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
    }
    static public void mostrarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    static public void introducirEnteroEntreLimites(int min, int max) {
        int valor;
        do {
            System.out.println("Introduzca un valor entre " + min + " y " + max);
            valor = teclado.nextInt();
        } while (valor < min || valor > max);
    }
    static public void disparar(int[][] tablero){
        int posicionBarcoX = (int) (Math.random() * 4);
        int posicionBarcoY = (int) (Math.random() * 4);

        boolean continuarJugando = true;
        while (continuarJugando) {
            System.out.print("Ingrese la fila (0-3): ");
            int fila = teclado.nextInt();
            System.out.print("Ingrese la columna (0-3): ");
            int columna = teclado.nextInt();

            if (fila == posicionBarcoX && columna == posicionBarcoY) {
                System.out.println("¡Felicidades! ¡Hundiste mi barco!");
                continuarJugando = false;
            } else {
                if (fila < 0 || fila > 3 || columna < 0 || columna > 3) {
                    System.out.println("Oops, esa no es una posición válida. Intente nuevamente.");
                } else {
                    System.out.println("Lo siento, ¡fallaste! Inténtalo de nuevo.");
                }
            }
        }
    }
}
