package com.codility;

import java.util.*;

public class DuplicateCharacerTest {

    public static void main(String[] args) {
        String s = "aaaabbbb";
        solution(s);
    }
    public static int solution(String S) {
        int result=0;
        Map<Character,Integer> chCountMap = new HashMap<>();
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(chCountMap.containsKey(c)){
                chCountMap.put(c,chCountMap.get(c)+1);
            }else{
                chCountMap.put(c,1);
            }
        }
        Object[] aa = chCountMap.values().toArray();
        if(chCountMap.size()==1) {
            result = 0;
        }else if(chCountMap.size()==2){
            if(aa[0] == aa[1]){
                result = 1;
            }else{
                result = 0;
            }
        }else {
            Set<Integer> uniqueSet = new HashSet<>();
            for (Map.Entry<Character, Integer> map : chCountMap.entrySet()) {
                if (!uniqueSet.add(map.getValue())) {
                    result = result + map.getValue();
                }
            }
            if (!uniqueSet.contains(1)) {
                result = result - 1;
            }
        }
        return result;
    }
}

