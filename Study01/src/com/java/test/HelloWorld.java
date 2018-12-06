package com.java.test;

public class HelloWorld {
    public static void main(String[] args) {
        String name = "张三";
        //类的实例化 person类的实例man
        person man = new person();
        man.sleep();
        man.name = "Max";
        System.out.println("姓名 = [" + man.name + "]" + man.getName());
        man.setName("大海");
        System.out.println("姓名 = [" + man.name + "]" + man.getName());
        System.out.println(name);
        man.info();
    }
}

class person {
    //1.属性
    String name = "大海";
    short age = 27;
    String love = "make love";

    //2.方法
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void info() {
        eat();
        sleep();

    }
}
