package com.zzjt.extend;

public class Person {
    private String name;
    private int age;

    public void eat(){
        System.out.println("吃饭");
        return;
    }
    public void show(){
        this.eat();
        System.out.println("姓名:"+this.name+"---"+"年龄:"+this.age);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
