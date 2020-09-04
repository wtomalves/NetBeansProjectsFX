/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author alexb
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,5,8,2};
        
        /*mostrar quantidade de caracter dentro o vetor N
        System.out.println("O total de casas de N é " + n.length);*/
        
        /*estrutura de repetição generica.
        for(int c=0; c<n.length; c+=1){*/
        for(int c=0; c<=3; c+=1){
            System.out.println("Na posição " + c + " temos o número " + n[c] );
        }
        System.out.println("*************************************************");
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String total[] = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
        for (int cont=0; cont<mes.length; cont+=1){
            System.out.println(mes[cont] + " tem " + total[cont] + " dias.");
            
        }
        System.out.println("*************************************************");
        int num[] = {6, 8, 4, 9, 1, 5, 7};
        //para cada elemento de num coloque dentro da variável
        for (int valor: num){
            System.out.print(valor + "... ");
        }
        System.out.println("\n*************************************************");
        //Para colocar os números em ordem
        
        int numeros[] = {6, 8, 4, 9, 1, 5, 7};
        Arrays.sort(numeros);
        for (int valores: numeros){
            System.out.print(valores + "... ");
        }
        System.out.println("\n*************************************************");
        int pos =Arrays.binarySearch(numeros, 9);
        System.out.println("Número encontrado na posição " + pos);
        System.out.println("\n*************************************************");
        
        
        //colocar o meso valor dentro dos vetores
        int vetor[] = new int[5];
        Arrays.fill(vetor, 10);
        for (int valor: vetor){
            System.out.print(valor + "... ");
        }
        System.out.println("\n");
        
        
        
        
        
        
        
        
        
    }
}
