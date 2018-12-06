package com.java.test;
/**
 *面向对象的封装
 * 将类的属性私有化
 * 提供公共的方法(setter&getter)来实现调用.
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.setAge(-1);
        a.setAge(2);
        a.setName("猴子");
        a.name="哈哈哈";
        a.info();
    }
}
class Animal{

     String name;

    public int getAge() {
        return age;
    }

    private int age;
    public void eat(){
        System.out.println("动物在吃饭");
    }
    public void name(){
        System.out.println("动物的名字"+name);
    }
    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
    public void info(){
        System.out.println("name:"+name+"\n"+"age:"+age);
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("您输入的信息有误");
        }else {
            this.age = age;
            System.out.println(age);
        }
    }
}
