package com.example.projectcwh;

class test{
   synchronized public void print(String str)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(str);

        try{
            Thread.sleep(5000);
        }catch(Exception e){System.out.println(e);
        }
    }
}}
class TaskA extends Thread{
    test t1;
    TaskA(test t1)
    {
      this.t1=t1;
    }

    @Override
    public void run() {
        t1.print("Welcome to college xyz");
    }
}
class TaskB extends Thread{
    test t1;
    TaskB(test t1)
    {
        this.t1=t1;
    }

    @Override
    public void run() {
        t1.print("Welcome to college abcdef");
    }
}
public class xyz {
    public static void main(String[] args) {
        test t1= new test();
        TaskA a = new TaskA(t1);
        TaskB b = new TaskB(t1);
        a.start();
        b.start();
    }
}
