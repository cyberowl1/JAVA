package com.example.projectcwh;

import java.util.LinkedList;

class PC {

    LinkedList<Integer> pd = new LinkedList<>();
    int size = 2;

    public void produce() throws InterruptedException {
        int value = 0;

        while (true) {
            synchronized (this) {

                while (pd.size() == size) {
                    wait();

                }
                    System.out.println("producer produced value:--" + +value);
                    pd.add(value);

                    notify();
                    Thread.sleep(1000);
                }
            }

        }


    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (pd.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int val = pd.removeFirst();
                System.out.println("consumer consumed :-" + val);
                Thread.sleep(1000);
            }
        }

    }
}

public class ExamPc {
    public static void main(String[] args) throws InterruptedException {

        PC p = new PC();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    p.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    p.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
