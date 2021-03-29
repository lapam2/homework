package com.panyu.homework;

import java.util.TreeSet;

public class Homework05 {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();
        //分析源码
        /*
            add 方法，因为TreeSet()构造器没有传入Comparator接口的匿名内部类，
            所有在底层 Comparable<? super K> k = (Comparable<? super K>) key;
            即把Person 转为 Comparable类型，故Person要实现Comparable接口，调用compareTo去重;
            不然就会抛出ClassCastException异常
         */
        treeSet.add(new Person());
        System.out.println(treeSet);

    }
}
class Person implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
