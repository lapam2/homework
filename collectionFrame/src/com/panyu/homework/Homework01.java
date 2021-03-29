package com.panyu.homework;

import java.util.ArrayList;

public class Homework01 {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("新闻一：寄语青少年习近平这十句话意味深长");
        arrayList.add("新闻二：安家各人物结局是什么?方似锦结局和谁在一起");

        int size = arrayList.size();
        for (int i = size -1 ; i >= 0; i--) {
           // System.out.println(arrayList.get(i));
            String str = (String) arrayList.get(i);
            System.out.println(processTitle(str));
        }
    }

    // 专门写一个方法，处理显示标题新闻
    public static String processTitle(String title) {
        if(title == null){
            return "";
        }

        if(title.length() > 15){
            return title.substring(0,15)+"...";
        } else{
            return title;
        }

    }
}


class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" + "title='" + title + '\'' + '}';
    }
}

