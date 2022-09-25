package com.example.projectcwh;

class table{

 synchronized public void print(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);
        }
    }
    }
}
class threada extends Thread{
    table t1;
    threada(table t1)
    {
        this.t1=t1;
    }

    @Override
    public void run() {
        t1.print(4);
    }
}
class threadb extends Thread {
    table t1;
    threadb(table t1)
    {
        this.t1=t1;
    }
    public void run() {
        t1.print(5);
    }
}
public class abc {
    public static void main(String[] args) {
    table t1 = new table();


        threada a = new threada(t1);
        threadb b = new threadb(t1);
        a.start();
        b.start();

    }
}
