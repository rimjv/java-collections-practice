package com.example.collections.map.basics;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static Map<Character,Integer> countCharacters (String input){

        char [] ch = input.toCharArray() ;
        Map<Character, Integer> resultMap = new HashMap<>() ;
        for(char ch1 : ch){
        resultMap.put(ch1, resultMap.getOrDefault(ch1,0 )+1) ;
        }
return resultMap ;
    }
    public static void main(String[] args) {
        System.out.println(countCharacters("hello"));
    }
}
