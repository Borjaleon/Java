/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historialshell;

import java.util.Scanner;
import metodos.Menu;
import metodos.Operaciones;

/**
 *
 * @author Borja
 */
public class HistorialShell {

    /**
     * @param args the command line arguments
     */
    public static String[] comandos = new String[100];
    public static int puntero = 0;
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int op = 0;
        do {            
            op = Menu.principal(sc);
            
            switch (op) {
                case 1:
                    Operaciones.engadirComando(sc);
                    break;
                case 2:
                    Operaciones.procurarUnComando(sc);
                    break;
                /*case 3:
                    Operaciones.procurarComandos();
                    break;
                case 4:
                    Operaciones.ultimosMovimientos();
                    break;
                case 5:
                    Operaciones.ultimosMovimientos();
                    break;
                 */
                case 6:
                    System.out.println("SALIENDO...");
                    break;
            }
        } while (op != 6);
    }

}
