package com.sdhy.test;

public class Hello {

    public static void main(String[] args) {
        System.out.println("hello my name is idea");
        long start=System.currentTimeMillis();
        add();
        int sum=0;
        for (int i=0;i<100;i++){
            sum=sum+i;
        }
        System.out.println("求和结果是："+sum);
        long end=System.currentTimeMillis();
        System.out.println("求和所用时间是："+(end-start));
    }

    public static void add() {
        System.out.println("flipped is my fonded film.");
    }
}
