/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author alexb
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Aqui quando usamos String com letra maiúscula é uma classe, 
        então automaticamente ele cria um objeto-*/
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String res1;
        res1 = (nome1==nome2)?"Igual!":"Diferente!";
        System.out.println(res1);
        
        
        /*Esse ultimo objeto foi instanciado  utilizando a clausula NEW. Técnicamente
        ele não tem a mesma estrutura de n1 e n2. O conteúdo é igual. Para verificarmos se é igual
        de fato vamos utilizar .EQUALS() que é um método que verifica se o conteúdo de um objeto 
        é igual ao outro*/
        String nome3 = new String("Gustavo");
        String res2;
        res2 = (nome1.equals(nome3))?"Sim, è Igual!":"Não. O nome é Diferente!";
        System.out.println(res2);
        
        
        
        
        
    }
    
}
