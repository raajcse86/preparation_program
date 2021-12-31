package com;

import java.util.*;

public class PaypalExample {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("--"+random.nextInt(10));


    }
    String generatePassword(int length)
    {
        String charset = "abcdefghijklmnopqrstuvwxyz0123456789";
        //Write code here.
        char[] charArray = new char[length];
        Set<Character> characterSet = new HashSet<>();
        Random random = new Random();
        int val = random.nextInt(charset.length());
        int duplicateCountMissed=0;
        for(int i=0;i<length;i++){
            if(characterSet.add(charset.charAt(val))){
               charArray[i]=charset.charAt(val);
            }else{
                i--;
            }
        }
        return new String(charArray);


    }

}
