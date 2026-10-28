package com.example.collections.map.basics;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static Map< String ,Integer> countWords(String s){
        String [] words = s.toLowerCase().split(" ") ;
        Map<String,Integer> resultMap = new HashMap<>() ;
        for (String s1 : words){
        resultMap.put(s1,resultMap.getOrDefault(s1,0)+1) ;
        }
        return resultMap ;
    }

    public static void main(String[] args) {
        System.out.println(countWords("the even when the"));
    }
}
