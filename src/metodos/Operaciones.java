/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import static historialshell.HistorialShell.*;
import java.util.Scanner;

/**
 *
 * @author Borja
 */
public class Operaciones {

    public static final String[] comandosValidos = {"cat", "cd", "cp",
        "dir", "date", "del", "find", "grep", "help", "ls", "man", "mv", "rm"};

    public static void engadirComando(Scanner sc) {

        System.out.println("Introduce un comando");
        String comando = sc.next();
        boolean valido = false;

        for (String comandoValido : comandosValidos) {
            if (comando.equals(comandoValido)) {
                comandos[puntero] = comando;
                puntero++;
                valido = true;
            }
        }
        if (!valido) {
            System.out.println("Comando no valido");
        }

    }

    public static void procurarUnComando(Scanner sc) {

        String aux = null;

        // Comprobamos que haya algo guardado 
        if (puntero != 0) {
            System.out.println("Introduce el comando que desea buscar");
            String busqueda = sc.next();

            // Recorremos el array
            for (int i = 0; i < puntero; i++) {

                // Comprobamos que la busqueda coincida
                if (comandos[i].startsWith(busqueda)) {
                    aux = comandos[i]; // Guardamos las coincidencias 
                }

            }
            System.out.println("El comando buscado es: " + aux);
        } else {
            System.out.println("No hay ningun comando guardado");
        }

    }

    public static void procurarTodosComandos(Scanner sc) {

        String[] aux = new String[100];
        int puntero2 = 0;

        // Comprobamos que haya algo guardado 
        if (puntero != 0) {
            System.out.println("Introduce el comando que desea buscar");
            String busqueda = sc.next();

            // Recorremos el array
            for (int i = 0; i < puntero; i++) {

                // Comprobamos que la busqueda coincida
                if (comandos[i].startsWith(busqueda)) {
                    aux[puntero2] = comandos[i]; // Guardamos las coincidencias
                    puntero2++;
                }

            }

            System.out.println("Las coincidencias son:");

            for (int i = (puntero2 - 1); i >= 0; i--) {
                System.out.println("\t" + i + " -> " + aux[i]);
            }

        } else {
            System.out.println("No hay ningun comando guardado");
        }

    }

    public static void baleirarHistorico(Scanner sc) {

        if (puntero != 0) {
            for (int i = 0; i <= puntero; i++) {
                comandos[i] = null;
            }
        } else {
            System.out.println("El historico ya esta vacio");
        }
        puntero = 0;
    }

    public static void consultarHistorico(Scanner sc) {
        int recientes = 0;
        String[] historico = new String[100];
        int puntero3 = 0;

        if (puntero != 0) {
            System.out.println("Introduce el numero de "
                    + "comandos recientes para mostrar");
            recientes = sc.nextInt();
            for (int i = (puntero - 1); i >= 0; i--) {
                historico[puntero3] = comandos[i];
                puntero3++;
            }
            System.out.println("Sus ultimos " + recientes + " comandos son: ");

            if (recientes < puntero + 1) {
                for (int i = 0; i < recientes; i++) {
                    System.out.println("\t" + i + " -> " + historico[i]);
                }
            }else{
                System.out.println("No tiene tantos comandos para mostrar");
            }
        } else {
            System.out.println("El historico esta vacio");
        }
    }
}
