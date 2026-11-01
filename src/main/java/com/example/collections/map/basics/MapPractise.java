package com.example.collections.map.basics;

import java.util.*;

public class MapPractise {
    static List<Integer> findDuplicates(int[] array1) {
        // Set implementation
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int n : array1) {
            if (!seen.add(n)) {
                duplicates.add(n);
            }
        }
        return new ArrayList<>(duplicates);
    }
static List<Integer> findDuplicatesBruteForce(int [] array1)
{
    List<Integer> resultList = new ArrayList<>() ;
    for (int i =0 ;i< array1.length;i++)
    {
        for(int j = i+1 ;j< array1.length;j++)
        {
            if (array1[i] == array1[j] && !resultList.contains(array1[i]))
            {
                resultList.add(array1[i]) ;
            }
        }
    }
return resultList ;
}

static int firstRepeated(int [] nums){
    List<Integer> resultList = new ArrayList<>() ;
    resultList = findDuplicatesBruteForce(nums);
    return resultList.get(0);

}


static ArrayList
        <List<String>> groupAnagram(String [] str){

    Map<String, List<String>> map = new HashMap<>();   // step 1

    for(String ch : str){
            char [] str1 = ch.toCharArray();
           Arrays.sort(str1);
           String key = new String(str1) ;
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(ch);
        }
    return new ArrayList<>(map.values()) ;
}

static String keyWithMaxValue(Map <String,Integer> map){
            return map.entrySet().stream()
                    .max(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey)
                    .orElse(null);
}
    public static void main(String[] args) {
        Map<String, Integer> scores = Map.of("a", 3, "b", 9, "c", 5);
        System.out.println("key with max values"+keyWithMaxValue(scores));
        System.out.println(
                "Returning Duplicates" + findDuplicatesBruteForce(new int[] {1, 3, 11, 3, 1, 3, 2, 4, 2}));
        System.out.println(
                "Returning First Repeated" + firstRepeated(new int[] {1, 3, 11, 3, 1, 3, 2, 4, 2}));
        System.out.println(
                "Group Anagrams" + groupAnagram(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));

    }
}
