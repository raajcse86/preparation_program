package com.custom.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomizedSet {
    List<Integer> intList = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();

    boolean insert(int number){
        intList.add(number);
        map.put(number,intList.size()-1);
        return true;
    }

    int search(int number){
        if(map.containsKey(number)){
            return map.get(number);
        }
        return -1;
    }

    boolean delete(int number){
        int index = search(number);
        int temp = intList.get(index);
        int lastElement = intList.get(intList.size()-1);
        intList.add(index,lastElement);
        intList.add(intList.size()-1,temp);
        intList.remove(intList.size()-1);
        return true;
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        randomizedSet.insert(3);
        System.out.println(randomizedSet.search(2));
    }


}
