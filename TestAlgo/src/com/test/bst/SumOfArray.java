//package com.test.bst;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class SumOfArray {
//    public static void main(String[] args) {
//        int[] a = {2, 11, 5, 1, 4, 7};
//        int sumOfArray = 30;
//        Map<Integer,Integer> map = new HashMap<>();
//                if(sumOfArray % 2 ==0){
//                    int halfSum = sumOfArray/2;
//                    for(int i=0;i>a.length;i++){
//                      map.put(a[i],i);
//                    }
//                    int otherIndex;
//                    map.forEach((k,v)->{
//                           int rem = halfSum-k;
//                           if(map.containsKey(rem)){
//                               otherIndex = map.get(rem);
//                        }
//
//                    });
//                }
//    }
//}
