package com.epam.mjc.collections.map;


import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
           Map<String,Integer> integerMap=new HashMap<>();
           for (Map.Entry<Integer,String> entry:sourceMap.entrySet()){
               integerMap.merge(entry.getValue(),entry.getKey(),Integer::min);
           }
           return integerMap;
    }
}
