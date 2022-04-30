/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkgfinal;

import java.util.Scanner;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author Andy Lopez
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int menu = 0;
        boolean salir = false;
        do {
            System.out.println("¿A cual opción desea ingresar?");
            System.out.println("************************");
            System.out.println("* 1. Comparación       *");
            System.out.println("* 2. Pirámide          *");
            System.out.println("* 3. Vacas             *");
            System.out.println("************************");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    int num1,
                     num2;

                    Scanner Numeros = new Scanner(System.in);
                    System.out.println("Ingrese el primer número: ");
                    num1 = Numeros.nextInt();

                    System.out.println("Ingrese el segundo número: ");
                    num2 = Numeros.nextInt();

                    if (num1 > num2) {
                        System.out.println("El primer número es mayor");
                    } else {
                        System.out.println("El segundo número es mayor");
                    }
                    break;

                case 2:
                    Scanner piramide = new Scanner(System.in);
                    System.out.print("Introduce un número: ");
                    int Número = piramide.nextInt();

                    do {
                        if (Número % 2 != 0) {
                            for (int altura = 1; altura <= Math.ceil((float) Número / 2); altura++) {
                                for (int Espacios = 1; Espacios <= Número - altura; Espacios++) {
                                    System.out.print(" ");
                                }

                                for (int column = 1; column <= (altura * 2) - 1; column++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        }

                    } while (!salir);
                    break;

                default:
                    System.out.println("Seleccione una opción válida");
            }
        } while (!salir);
        while (menu != 3) {

        }

    }

}
