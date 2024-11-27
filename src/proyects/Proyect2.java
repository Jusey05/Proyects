package proyects;

import java.util.Scanner;

public class Proyect2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][][] matriz;
        int cant_x;
        int cant_y;
        int cant_z;

        try {
            System.out.print("Diga la cantidad de x: ");
            cant_x = sc.nextInt();

            System.out.print("Diga la cantidad de y: ");
            cant_y = sc.nextInt();

            System.out.print("Diga la cantidad de z: ");
            cant_z = sc.nextInt();

            matriz = new int[cant_x][cant_y][cant_z];

            System.out.println("Guardando la matriz");

            for (int i = 0; i < cant_x; i++) {
                for (int j = 0; j < cant_y; j++) {
                    for (int h = 0; h < cant_z; h++) {
                        System.out.print("Matriz [" + (i+1) + "][" + (j+1) + "][" + (h+1) + "]: ");
                        matriz[i][j][h] = sc.nextInt();
                    }

                }

            }

            System.out.println("\nMostrando la matriz: ");

            for (int i = 0; i < cant_x; i++) {
                for (int j = 0; j < cant_y; j++) {
                    for (int h = 0; h < cant_z; h++) {
                        System.out.print(matriz[i][j][h] + " ");
                    }
                    System.out.println("\n");
                }

            }

        } catch (Exception e) {
            System.out.println("Entre el tipo de dato correcto");
        }
        sc.close();
    }

}
