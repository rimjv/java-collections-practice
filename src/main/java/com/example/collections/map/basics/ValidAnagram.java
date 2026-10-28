package com.example.collections.map.basics;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean isAnagram(String s1,String s2) {
        Map<Character, Integer> resultMap = new HashMap<>();
        if(s1.length() != s2.length())
            return false;
        for (char ch : s1.toCharArray())
        {
            resultMap.put(ch, resultMap.getOrDefault(ch,1)+1) ;
        }
        for (char ch1 : s2.toCharArray())
        {
            int count = resultMap.getOrDefault(ch1,0) ;
            if(count == 0)
                return false ;
            resultMap.put(ch1,count-1) ;
        }return true ;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));
    }
}
