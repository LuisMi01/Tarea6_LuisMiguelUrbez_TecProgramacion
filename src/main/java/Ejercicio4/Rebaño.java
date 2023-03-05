package Ejercicio4;

import java.lang.reflect.Array;

public class Rebaño {
    public static void main(String[] args) {
        char sim1= '>';
        char sim2= '<';
        char sim= '.';
        char[] tablero = {sim1, sim1, sim1, sim, sim2, sim2, sim2};

        System.out.println("Tablero inicial:");
        imprimirTablero(tablero);
        System.out.println("Tablero final:");
        resolverJuego(tablero);
        imprimirTablero(tablero);


    }

    public static void resolverJuego(char[] tablero) {
        for(int i=0; i<tablero.length; i++) {
            if(tablero[i] == 1) {
                char sim1= '>';
                char sim2= '<';
                char sim= '.';
                if(i>=2 && tablero[i-1] == sim1 && tablero[i-2] == sim1) {
                    tablero[i-2] = sim1;
                    tablero[i-1] = sim1;
                    tablero[i] = sim;
                    imprimirTablero(tablero);
                }else if(i<=tablero.length-3 && tablero[i+1] == sim2 && tablero[i+2] == sim) {
                    tablero[i+2] = sim2;
                    tablero[i+1] = sim;
                    tablero[i] = sim1;
                    imprimirTablero(tablero);
                }
            }
        }
    }

    public static void imprimirTablero(char[] tablero) {
        for(int i=0; i<tablero.length; i++) {
            System.out.print(tablero[i] + " ");
        }
        System.out.println();
    }
}