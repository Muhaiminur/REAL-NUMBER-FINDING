/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse420.lab03.real.number;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 *
 * @author 12301019
 */
public class CSE420LAB03REALNUMBER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            BufferedReader br = new BufferedReader(new FileReader("FINDNUMBER.txt"));
            String line;
            while ((line = br.readLine()) != null){
                //System.out.println(line);
                if(check(line)){
                    System.out.println("Accept");
                }else{
                    System.out.println("reject");
                }
            }

        } catch (Exception e) {
        }
    }
    public static boolean check(String s){
        boolean r=false;
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        String []op={"+","-","/","%","*","="};
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isDigit(c)||c=='+'||c=='.'||c=='-'||c=='/'||c=='*') {
                if(c=='+'){
                    c1++;
                    if(c1>1){
                        return false;
                    }
                }
                if(c=='.'){

                    for (int j =i+1; j < charArray.length; j++) {
                        char d = charArray[j];
                        if(d=='+'||d=='.'||d=='-'||d=='/'||d=='*'){
                            return false;
                        }
                    }
                    c2++;
                    if(c2>1){
                        return false;
                    }
                }
                if(c=='-'||c=='/'||c=='*'){
                    c3++;
                    if(c3>1){
                        return false;
                    }
                }
                if(c=='*'){
                    c4++;
                    if(c4>1){
                        return false;
                    }
                }
            }else{
                return false;
            }
        }
        return true;
    } 
    
}
