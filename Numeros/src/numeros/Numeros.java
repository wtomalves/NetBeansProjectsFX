/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author alexb
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, soma = 0; 
        Scanner teclado = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            soma += n;
            System.out.print("Quer continuar: [S/N] ");
            resp = teclado.next();
        } while(resp.equals("S"));
        System.out.println("A soma de todos os valores é " + soma);
    }   
    
}
