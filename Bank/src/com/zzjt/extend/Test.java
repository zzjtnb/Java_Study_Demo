package com.zzjt.extend;

public class Test {
    public static void main(String[] args) {
        Student tom=new Student("张三",18);

        System.out.println(tom.getAge()+tom.getName());
        tom.setName("李四");
        System.out.println("姓名:"+tom.getName());
    }

}
