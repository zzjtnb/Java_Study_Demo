package com.zzjt.test;

import java.util.Date;

/**
 * this:
 * 1.可以用来修饰属性、方法、构造器
 * 2.this为当前对象或当前正在创建的对象.比如:this.name;this.shoe();
 *      this():可以用来显示的调用当前类的重载的指定的构造器
 * 3.可以在构造器中通过"this(形参)"的方式显示的调用本类中其它重载的指定的构造器.
 *     要求: 在构造器内部,必须声明的首行
 *          若一个类中有N个构造器,那么最多有N-1个构造器中使用了this();
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Person p=new Person("张三");
        p.info();
        p.setName("李四");
        p.info();
        Person2 p1=new Person2("韩梅梅");
        System.out.println(p1.getName());
        Date time=new Date();
        System.out.println(time.clone());
    }
}
class Person{

    private String name;
    private int age=10;
    public Person(String n){
        name=n;
    }
    public void setName(String name){
    this.name=name;
    }
    public String getName() {
        return name;
    }
    public void info(){
        System.out.println("姓名:"+name+"+"+"年龄:"+age);
        this.show();//表示当前对象,谁调用谁就是当前对象
    }
    public void show(){
        System.out.println("我是一个人");
    }
}
