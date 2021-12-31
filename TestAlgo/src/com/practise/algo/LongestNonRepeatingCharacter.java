package com.practise.algo;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingCharacter {

    public static void main(String[] args) {
        String s="geeksforgeeks";
        int maxLengthSoFar=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                maxLengthSoFar = Math.max(maxLengthSoFar,map.size());
                map.clear();
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(maxLengthSoFar);


    }
}
