/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author SALA I
 */
public class Palindromo {
    
    public static void main(String[] args) {
        // TODO code application logic here

        boolean flag = palindromeCheck("anilina");
        System.out.println(flag);

    }  

    public static boolean palindromeCheck(String s){
        if(s.length()== 0 || s.length() == 1) {
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length() -1)){
            return palindromeCheck(s.substring(1,s.length()-1));
        }
        return false;
    }
}
 