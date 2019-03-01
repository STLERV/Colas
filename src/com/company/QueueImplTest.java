package com.company;
import java.util.*;
public abstract class QueueImplTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("QUE QUIERES HACER?:");
            System.out.println("1 : Añadir objeto");
            System.out.println("2 : Poner objeto en la cola");
            System.out.println("2 : quitar objeto de la cola");
            System.out.println("0 : Salir de la Aplicación\n");

            String input = scan.nextLine();
            int choice = 0;
            choice = Integer.parseInt(input);


            switch (choice) {
                case -1: {
                    System.out.println("Numero inválido");
                    break;
                }
                case 0: {
                    return;
                }
                case 1: {
                    System.out.print("Nombre: ");
                    String nombre = scan.nextLine();
                    System.out.print("Valor: ");
                    int valor = 30;

                    Objetos o = new Objetos(nombre, valor);
                    //añadirObjeto(o);

                            break;
                }
                case 2:{
                    System.out.print("Nombre de usuario que desea meter : ");
                    String nombre = scan.nextLine();

                    break;

                }
            }
        }
    }

}


