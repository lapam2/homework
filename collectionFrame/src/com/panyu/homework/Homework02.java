package com.panyu.homework;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car1 = new Car("宝马",400000);
        Car car2 = new Car("宾利", 5000000);

        //1.add添加单个元素
        arrayList.add(car1);
        arrayList.add(car2);
        System.out.println(arrayList);
        //2.remove删除指定元素
        arrayList.remove(car1);
        System.out.println(arrayList);
        //3.查找元素是否存在
        System.out.println(arrayList.contains(car1));//false
        System.out.println(arrayList.contains(car2));//true
        //4.size获取元素个数
        System.out.println(arrayList.size());
        //5.isEmpty()判断是否为空
        System.out.println(arrayList.isEmpty());
        //6.clear清空
       // arrayList.clear();
        //7.addAll()添加多个元素
        System.out.println(arrayList);
        arrayList.addAll(arrayList);
        System.out.println(arrayList);
        //8.containsAll查找多个元素是否都存在
        System.out.println(arrayList.containsAll(arrayList));
        //9.removeAll删除多个元素
        //arrayList.removeAll(arrayList);
        //System.out.println(arrayList.removeAll(arrayList));
        //10.使用增强for 和 迭代器遍历所有car
        for(Object o : arrayList){
            System.out.println(o);
        }

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }



    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}
