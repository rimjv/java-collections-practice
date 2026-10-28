package com.example.collections.map.basics;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static Character findFirst(String s){
        Map<Character,Integer> resultMap = new HashMap<>() ;

        for(char ch : s.toCharArray()){
        resultMap.put(ch,resultMap.getOrDefault(ch,0)+1);
        }
        for(char ch :s.toCharArray())
        {
            if (resultMap.get(ch) ==1)
                return ch ;
        }
      return null;
    }

    public static void main(String[] args) {
        System.out.println(findFirst("swiss"));
    }
}
