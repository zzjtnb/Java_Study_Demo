package com.java.test;
/**
 * 方法的参数传递
 * 1.定义
 * 形参:方法声明时,方法小括号内的参数
 * 实参:调用方法时,实际传入的参数的值
 *
 * 2.传递规则(规律):Java中的参数传递机制:值传递机制
 * 1)形参是基本数据类型的
 * 2)形参是引用数据类型的
 * 变量:
 * 局部变量:方法中的变量,局部变量都存在于栈空间
 */
public class TestArgsTransfer {
    public static void main(String[] args) {
        TestArgsTransfer t = new TestArgsTransfer();
        int i=5;
        int j=10;
//        System.out.printf("i:"+i+"j:"+j);
        //交换变量i与j的值
    /*    int temp=i;
        i=j;
        j=temp;
        System.out.printf("i:"+i+"j:"+j);
        */
        t.swap(i, j);
        t.swap(100, 500);

    }
//    定义一个方法
    public void swap(int i,int j){
        int temp=i;
        i=j;
        j=temp;
        System.out.printf("i:"+i+"j:"+j);
    }
}
