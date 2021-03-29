package com.panyu.homework;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class Homework04 {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Dog p1 = new Dog(1001,"AA");
        Dog p2 = new Dog(1002, "BB");
        hashSet.add(p1);
        hashSet.add(p2);
        p1.name = "CC";
        hashSet.remove(p1);
        System.out.println(hashSet);//2个对象
        hashSet.add(new Dog(1001,"CC"));
        System.out.println(hashSet);//3个对象
        hashSet.add(new Dog(1001,"AA"));
        System.out.println(hashSet);//4个对象





    }
}
class Dog{
    public int id;
    public String name;

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dog dog = (Dog) o;
        return id == dog.id && name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Dog{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
//HashSet 和 TreeSet 如何实现去重？
// 底层实现原理：HashSet利用比较hash值 和 equals()方法
// TreeSet利用构造器调用的Comparator的匿名内部类实现
