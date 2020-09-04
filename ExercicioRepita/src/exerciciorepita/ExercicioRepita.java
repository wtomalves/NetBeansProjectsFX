/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author alexb
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*AQUI VAI CRIAR UMA CAIXA COM O TITULO DE bOAS VIDAS E A FRASE OLÁ MUNDO
        JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        */
        
        
        /* esta aqui é para aparecer uma caixa onde podemos digitar um valor
        JOptionPane.showInputDialog(null, "Informe um número: ");
        */
        
        
        /*MAS PARA ATRINUIRMOS DENTRO DE UMA VARIÁVEL DEVEMOS FAZER DA SEGUITE FORMA
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        */
        
        
        /*ALÉM DE SOLICITAR O VALOR PODEMOS PEDIR QUE TAMBEM MOSTRE EM UMA TELA APARTE/*
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        JOptionPane.showMessageDialog(null,"Voce digitou o valor " + n);*/
        
        
        //AGORA VAMOS PARA O EXERCICIO QUE O GUANA QUER MOSTRAR PARA SABERMOS O QUE PODEMOS FAZER
        //USAMOS TAMBEM NA FORMATAÇÃO HTML
        
        int n, soma = 0, cont = 0, par = 0, impar = 0, acimade100= 0, media = 0;
        do {
           //contar quantos números digitados
           cont += 1;
           
           //número digitado pelo usuário
           n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
           
           //contando par ou impar
           if (n % 2 == 0){
               par += 1;
               if (n >= 100){
                   acimade100 += 1;
               }
           }else{
               impar += 1;
               if (n >= 100){
                   acimade100 += 1;
               }
           }
           //somar os números digitados
           soma += n;
           
           
           
        }while (n != 0);
        
        //Media dos valores 
        media = soma / cont;
        
        
        //Mensagem para exibir na tela
        JOptionPane.showMessageDialog(null,"<html>Total de valores: " + cont + "<br>" +
                " A soma dos valores são " + soma + "<br>" +
                " Total de pares " + par + "<br>" + "A total de Impares " + impar + "<br>" +
                " Acima dos 100: " + acimade100 + "<br>" + " A media dos valores: " + media + "<br>" +"</html>");
        
        
        
        
        
           
        
}

    
}
