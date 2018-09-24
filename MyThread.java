/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythread;

class MyThread extends Thread {
@override 
    public void run() {
        System.out.println("running...");
        System.out.println("Yeoh Peg Gee....");
        System.out.println("245296");
        
    }

    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("id of t1:" + t1.getId());

        t1.start();
        t2.start();

        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }
}
