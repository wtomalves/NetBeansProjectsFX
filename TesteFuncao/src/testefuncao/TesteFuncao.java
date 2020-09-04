/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author alexb
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    /*static void soma (int a, int b){
         int soma = a + b;
         System.out.println("A soma é " + soma);
     }*/
    
    static int soma (int a, int b){
         int soma = a + b;
         return soma;
     }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int sm = soma (5, 2);
        System.out.println("A soma vale " + sm);
        
    }
    
}
