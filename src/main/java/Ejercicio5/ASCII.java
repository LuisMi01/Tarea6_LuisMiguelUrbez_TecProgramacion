package Ejercicio5;

import java.util.Scanner;

public class ASCII {

        static char[][] tabla = new char[10][40];
        static char pintura = '*';

        public static void main(String[] args) {

            for (int i = 0; i < tabla.length; i++) {
                for (int j = 0; j < tabla[i].length; j++) {
                    tabla[i][j] = ' ';
                }
            }

            mostrarDibujo();

            Scanner sc = new Scanner(System.in);
            int opcion = 0;
            while (opcion != 4) {
                System.out.println("\n--- MENÚ ---");
                System.out.println("1. Dibujar un carácter");
                System.out.println("2. Dibujar un rectángulo con un conjunto de caracteres");
                System.out.println("3. Cambiar el color usando un bote de pintura");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        dibujarCaracter();
                        mostrarDibujo();
                        break;
                    case 2:
                        dibujarRectangulo();
                        mostrarDibujo();
                        break;
                    case 3:
                        //cambiarColor();
                        mostrarDibujo();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida, por favor seleccione otra opción.");
                        break;
                }
            }
        }


        public static void mostrarDibujo() {
            for (int i = 0; i < tabla.length; i++) {
                for (int j = 0; j < tabla[i].length; j++) {
                    System.out.print(tabla[i][j]);
                }
                System.out.println();
            }
        }

        public static void dibujarCaracter() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca la fila (1-10): ");
            int fila = sc.nextInt() - 1;
            System.out.print("Introduzca la columna (1-40): ");
            int columna = sc.nextInt() - 1;
            System.out.print("Introduzca el carácter: ");
            char caracter = sc.next().charAt(0);
            tabla[fila][columna] = caracter;
        }
        
        public static void dibujarRectangulo() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca la fila inicial (1-10): ");
            int filaInicial = sc.nextInt() - 1;
            System.out.print("Introduzca la columna inicial (1-40): ");
            int columnaInicial = sc.nextInt() - 1;
            System.out.print("Introduzca la fila final (1-10): ");
            int filaFinal = sc.nextInt() - 1;
            System.out.print("Introduzca la columna final (1-40): ");
            int columnaFinal = sc.nextInt() - 1;
            System.out.print("Introduzca el carácter: ");
            char caracter = sc.next().charAt(0);
            for (int i = filaInicial; i <= filaFinal; i++) {
                for (int j = columnaInicial; j <= columnaFinal; j++) {
                    tabla[i][j] = caracter;
                }
            }
        }
}
