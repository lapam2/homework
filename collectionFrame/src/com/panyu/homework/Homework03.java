package com.panyu.homework;

import java.util.*;

public class Homework03 {
    public static void main(String[] args){
        Map m = new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);
        System.out.println(m);

        m.put("jack",2600);
        System.out.println(m);

        Set keySet = m.keySet();
        for(Object key : keySet){
            m.put(key, (Integer)m.get(key) + 100);
        }
        System.out.println(m);

        //迭代器,遍历所有员工
        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + "..." +entry.getValue());
        }

        // 遍历工资
        Collection values = m.values();
        for(Object value : values){
            System.out.println("工资="+value);
        }


    }
}

