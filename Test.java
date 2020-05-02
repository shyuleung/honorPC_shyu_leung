package com.thread.test2;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("继承Thread类");
    }
}
 
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("实现Runnable接口");
    }
}
 
public class Test {
    public static void main(String args[]) {
        //启动继承Thread类创建的线程对象
        MyThread t1 = new MyThread();
        t1.start();
 
        //启动实现Rinnable接口创建的线程对象
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        System.out.print("333333333333333");
        System.out.print("44444");
        System.out.print("5555");


    }
 
}
