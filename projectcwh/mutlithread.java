package com.example.projectcwh;

class thread extends Thread{
    @Override
    public void run() {
      for(int i=0;i<6;i++)
      {
          System.out.println(i);
      }
    }
}
class thread2 implements Runnable
{
    @Override
    public void run() {
        System.out.println("hey i am runnable");
        for(int i=9;i<19;i++)
        {
            System.out.println(i);
        }
    }
}
public class mutlithread {
    public static void main(String[] args) {
        thread a = new thread();
        a.run();

        thread2 b = new thread2();
        Thread bc = new Thread(b);
        bc.run();
    }
}
