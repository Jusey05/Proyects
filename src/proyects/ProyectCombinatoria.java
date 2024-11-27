package proyects;

import java.util.Scanner;

public class ProyectCombinatoria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n, r, x, y, z, permutacionRepeticion, variacionSinrepeticion, nElevado, NR, combinacionSinrepeticion, NR1, N1, combinacionConrepeticion;
        boolean seRepite, orden;

        try {
            do {
                long factorialN = 1, factorialX = 1, factorialY = 1, factorialZ = 1, factorialNR = 1, factorialR = 1, factorialNR1 = 1, factorialN1 = 1;

                System.out.print("\nDiga la poblacion: ");
                n  = sc.nextLong();

                System.out.print("Diga la muestra: ");
                r = sc.nextLong();

                if (n <= 0 || r <= 0) {
                    System.out.println("No se puede realizar ninguna operacion"); break;
                }

                System.out.println("Si hay orden diga 'true', caso de no haber diga 'false': ");
                orden = sc.nextBoolean();

                if (orden) {
                    if (r == n) {
                        System.out.print("Si hay repeticion diga 'true', caso de no haber diga 'false': ");
                        seRepite = sc.nextBoolean();

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
                    else if (n != r) {
                        System.out.println("Si hay repeticion diga 'true', caso de no haber diga 'false': ");
                        seRepite = sc.nextBoolean();

                        if (seRepite) {
                            nElevado = (long)(Math.pow(n, r));
                            System.out.println("La variacion con repeticion es: " + nElevado);

                        } else {
                            for (int i = 1; i <= n; i++) {
                                factorialN *= i;
                            }

                            NR = n - r;

                            for (int i = 1; i <= NR; i++) {
                                factorialNR *= i;
                            }

                            variacionSinrepeticion = factorialN / factorialNR;

                            System.out.println("La variacion sin repeticion es: " + variacionSinrepeticion);
                        }

                    }

                } else {
                    System.out.println("Si hay repeticion diga 'true', caso de no haber diga 'false': ");
                    seRepite = sc.nextBoolean();

                    if (seRepite) {
                        NR1 = n + r -1;

                        for (int i = 1; i <= NR1; i++) {
                            factorialNR1 *= i;
                        }

                        for (int i = 1; i <= r; i++) {
                            factorialR *= i;
                        }

                        N1 = n -1;

                        for (int i = 1; i <= N1; i++) {
                            factorialN1 *= i;
                        }

                        combinacionConrepeticion = factorialNR1 / (factorialR * factorialN1);

                        System.out.println("La combinacion con repeticion es: " + combinacionConrepeticion);

                    } else {
                        for (int i = 1; i <= n; i++) {
                            factorialN *= i;
                        }

                        for (int i = 1; i <= r; i++) {
                            factorialR *= i;
                        }

                        NR = n - r;

                        for (int i = 1; i <= NR; i++) {
                            factorialNR *= i;
                        }

                        combinacionSinrepeticion = factorialN / (factorialR * factorialNR);

                        System.out.println("La combinacion sin repeticion es: " + combinacionSinrepeticion);
                    }

                }

            } while ( n > 0 || r > 0);

        } catch (Exception e) {
            System.out.println("Ingrese el tipo de datos correcto");
        }
        sc.close();
    }

}
