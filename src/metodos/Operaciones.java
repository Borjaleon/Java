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

    public static final String[] comandosValidos = {"cat", "cd", "cp", "dir", "date",
        "del", "find", "grep", "help", "ls", "man", "mv", "rm"};

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

    /*public static void procurarComando(Scanner sc) {
        String[] mensajes = new String[13];
        int puntero2 = 0;
        String aux;
        int posicion = 0;

        // Comprobamos que haya algo guardado 
        if (puntero != 0) {
            System.out.println("Introduce el comando que desea buscar");
            String busqueda = sc.next();

            // Recorremos el array
            for (int i = 0; i < puntero; i++) {

                // Comprobamos que la busqueda coincida
                if (comandos[i].startsWith(busqueda)) {
                    aux = comandos[i]; // Guardamos las coincidencias
                    posicion = i; // Guardamos la posicion en la que se encontro

                    // Recorre el array desde la posicion en la que estamos hasta el final
                    for (int j = i; j < puntero; j++) {

                        // En caso de que haya varias coincidencias nos quedamos solo con la ultima
                        if (comandos[j].equals(aux) && j > posicion) {
                            posicion = j;
                        }

                    }

                    // Guardamos el contenido del array en la posicion en la que me encuentro
                    // y la ultima posicion en la que lo encontro
                    mensajes[puntero2] = "Encontrado el comando " + aux
                            + " en la posicion " + (posicion + 1);
                    puntero2++;
                }
            }

            // Eliminamos los mensajes duplicados
            String filtro;
            for (int i = 0; i < puntero2; i++) {
                filtro = mensajes[i]; // Se guarda cada mensaje del array

                // Recorre el array desde i + 1 hasta el final
                for (int j = i + 1; j < puntero2; j++) {
                    // Evita que entre en las casillas vacias
                    if (mensajes[j] != null) {
                        // Elimina los mensajes duplicados
                        if (filtro.equals(mensajes[j])) {
                            mensajes[j] = null;
                        }
                    }
                }
            }

            // Recorre el array y muestra los mensajes
            for (String mensaje : mensajes) {
                if (mensaje != null) { // Evita que entre en las casillas vacias
                    System.out.println(mensaje);
                }
            }
        } else {
            System.out.println("Todavia no se ha introducido ningun comando");
        }
    }*/
    public static void procurarUnComando(Scanner sc) {

        String aux;
        int puntero2 = 0;
        
        // Comprobamos que haya algo guardado 
        if (puntero != 0) {
            System.out.println("Introduce el comando que desea buscar");
            String busqueda = sc.next();

            // Recorremos el array
            for (int i = 0; i < puntero; i++) {
                
                // Comprobamos que la busqueda coincida
                if (comandos[i].startsWith(busqueda)) {
                    aux = comandos[i]; // Guardamos las coincidencias 
                    puntero2 ++;
                    System.out.println("El comando buscado es: " + aux);
                }
                
            } 
            
            
        } else {
            System.out.println("No hay ningun comando guardado");
        }
        
    }
}
