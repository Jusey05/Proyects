package proyects;

import java.util.Scanner;

public class Proyect1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n, r, x, y, z, permutacionRepeticion;
        boolean seRepite;

        try {
            do{
                long factorialN = 1, factorialX = 1, factorialY = 1, factorialZ = 1;

                System.out.print("\nDiga la poblacion: ");
                n = sc.nextLong();

                System.out.print("Diga la muestra: ");
                r = sc.nextLong();

                if (n != r || n <= 0 || r <= 0) {
                    System.out.print("No se puede realizar la permutación."); break;
                }

                System.out.print("Si hay repeticion diga 'true', caso de no haber diga 'false': ");
                seRepite = sc.nextBoolean();

                if (n == r) {
                    if (seRepite) {
                        System.out.print("Diga el valor de x: ");
                        x = sc.nextLong();

                        System.out.print("Diga el valor de y: ");
                        y = sc.nextLong();

                        System.out.print("Diga el valor de z: ");
                        z = sc.nextLong();

                        if (x <= 0 || y <= 0 || z <= 0) {
                            System.out.println("Los valores deben ser positivos"); break;
                        }

                        for (int i = 1; i <= n; i++) {
                            factorialN *= i;
                        }

                        for (int i = 1; i <= x; i++) {
                            factorialX *= i;
                        }

                        for (int i = 1; i <= y; i++) {
                            factorialY *= i;
                        }

                        for (int i = 1; i <= z; i++) {
                            factorialZ *= i;
                        }

                        permutacionRepeticion = factorialN / (factorialX * factorialY * factorialZ);

                        System.out.print("La permutacion con repeticion es: " + permutacionRepeticion);

                    } else {
                        for (int i = 1; i <= n; i++) {
                            factorialN *= i;
                        }
                        System.out.print("La permutacion sin repeticion es: " + factorialN);
                    }

                }

            } while ( n > 0 || r > 0);

        } catch (Exception e) {
            System.out.println("Entre el tipo de dato correcto");
        }
        sc.close();
    }

}
