package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class ComparatorTest {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("UnitedKingdom","UnitedStates","Australia","India","Pakistan");
        Collections.sort(list, new Comparator<String>()
        {
            public int compare(String o1, String o2)
            {
                if (o1.equals(o2)) // update to make it stable
                    return 0;
                if (o1.equals("India"))
                    return -1;
                if (o2.equals("India"))
                    return 1;
                return o1.compareTo(o2);
            }
        });
//        Comparator<String> compString2 = (s1,s2)->{
//            if(s1.equalsIgnoreCase("India`")){
//                return -1;
//            }else if(s2.equalsIgnoreCase("India")){
//                return 1;
//            }else if(s1.equalsIgnoreCase(s2)){
//                return 0;
//            }
//            return s1.compareTo(s2);
//        };
//        Collections.sort(list,compString2);
        System.out.println(list);

    }
}
