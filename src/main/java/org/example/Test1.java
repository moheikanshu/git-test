package org.example;

public class Test1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            System.out.println(Thread.currentThread().getName()+"::"+Thread.currentThread().isDaemon());
            while(true){

            }
        },"aa");
        thread.setDaemon(true);
        thread.start();
        System.out.println(Thread.currentThread().getName()+"over");
    }
}