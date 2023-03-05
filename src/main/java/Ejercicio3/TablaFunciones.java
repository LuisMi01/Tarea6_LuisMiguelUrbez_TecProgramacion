package Ejercicio3;
import java.util.Scanner;
public class TablaFunciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] tabla = new int[4][4];


        System.out.println("ingrese el valor minimo que quieres que se use en la tabla");
        int minimo = teclado.nextInt();
        System.out.println("ingrese el valor maximo que quieres que se use en la tabla");
        int maximo = teclado.nextInt();


        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        mostrarNumeroMayor(tabla);

    }

    static public void mostrarNumeroMayor(int[][] tabla){
        int mayor = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] > mayor){
                    mayor = tabla[i][j];
                }
            }
        }
        System.out.println("El numero mayor es: " + mayor);
    }
}
