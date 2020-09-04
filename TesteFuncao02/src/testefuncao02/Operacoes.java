/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author alexb
 */
public class Operacoes {
    
    public static String contador (int i, int f){
        String s = "";
        for (int c = 0; c <= f; c += 1){
            s += c + "... ";
        }
        return s;
    }
    
}
