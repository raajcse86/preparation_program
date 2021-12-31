package com.test;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatableCharacter {
    public static void main(String[] args) {
        String s="zzzzzbbbccccddehhhhiii";
        Map<Character,Integer> map = new HashMap<>();
        char[] cArray = s.toCharArray();
        for(Character c:cArray){
            if(s.indexOf(c) == s.lastIndexOf(c)){
                System.out.println("This is first non repeatable character -- "+c);
                break;
            }
        }

    }
}
