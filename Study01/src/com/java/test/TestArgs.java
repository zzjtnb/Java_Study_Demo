package com.java.test;

public class TestArgs {
    /*可变个数的形参方法
    1.格式,对于方法的形参:数据类型...形参名
    2.可变个数的形参方法与同名的方法之间构成重载
    3.可变个数的方法在调用时,个数从0开始,到无穷多个
    4.使用可变多个形参的方法与方法的形参使用数组是一致的
    */
    public static void main(String[] args) {
        TestArgs t = new TestArgs();
        t.sayHello();
        /*
        s.sayHello("水电费");
        s.sayHello("就会很快很快就");
        */
//        t.sayHello(new String[]{"Hello China", "Hello BeiJing"});
        t.sayHello("Hello China", "Hello BeiJing");
        t.getSum(5, 5);
    }

    //以下三个方法构成重载
//    在类中一旦定义了重载的可变个数的形参方法以后,如下的两个方法可以省略
/*    public void sayHello(){
        System.out.println("HelloWorld");
    }
    public void sayHello(String str1) {
        System.out.println("Hello " + str1);
    }*/

    public void sayHello(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + "--Brice");
        }
        System.out.println("=====");
    }

    public void sayHello(int i, String... args) {
        System.out.println(i);
        for (int j = 0; j < args.length; j++) {
            System.out.println(args[j] + "--@");
        }
    }

    /*   public void sayHello(String[] args) {
           for (int i = 0; i < args.length; i++) {
               System.out.println(args[i]);
           }
       }*/
//    可变个数形参使用的例子
//    public int getSum(int i, int k) {
//        return i + k;
//    }
//
//    public int getSum(int i, int k, int j) {
//        return i + k + j;
//    }

    public int getSum(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        System.out.println(sum);
        return sum;
    }


}
