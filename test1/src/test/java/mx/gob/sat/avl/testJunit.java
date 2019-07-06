/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.sat.avl;

/**
 *
 * @author jesuscs
 */
public class testJunit {
    
    public int square(int valor){
        return valor*valor;
    }
    
    public int countA(String word){
        int count=0;
        for(int i = 0; i < word.length();i++){
            if(word.charAt(i) == 'a' || word.charAt(i)== 'A'){
                count++;
            }
        }
        return count;
        
    }
    
}
