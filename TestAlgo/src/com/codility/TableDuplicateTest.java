package com.codility;

import java.util.ArrayList;
import java.util.List;

public class TableDuplicateTest {

    public static void main(String[] args) {
    String s = "id,name,age,score\n1,Jack,NULL,12\n17,Betty,28,11";
        System.out.println(">> "+solution(s));
    }

    public static String solution(String S) {
        String[] strArray = S.split("\n");
        String[] cellHeaders = strArray[0].split(",");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(strArray[0]);
        stringBuilder.append("\n");
        for(int i=1;i<strArray.length;i++){
            String[] cells = strArray[i].split(",");
            boolean nullFlag =false;
            if(cellHeaders.length == cells.length){
                for(int j=0;j<cells.length;j++){
                    if(cells[j].equals("NULL")){
                        nullFlag = true;
                    }
                }
                if(!nullFlag){
                    stringBuilder.append(strArray[i]);
                    if(i!=strArray.length-1){
                        stringBuilder.append("\n");
                    }
                }
            }
        }
        return stringBuilder.toString().trim();
    }


}
