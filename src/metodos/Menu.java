/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author Borja
 */
public class Menu {
    
    public static int principal(Scanner sc) {
        int op;
        System.out.println("MENÚ:\n"
                + "1. Engadir comando\n"
                + "2. Procurar un comando\n"
                + "3. Procurar todos os comandos\n"
                + "4. Baleirar historico\n"
                + "5. Consultar historico\n"
                + "6. Salir");
        op = sc.nextInt();
        return op;
    }
    
}
