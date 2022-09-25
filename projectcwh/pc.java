//package com.example.projectcwh;
//
//import java.util.*;
//import java.util.concurrent.ArrayBlockingQueue;
//
//public class pc {
//    public static void main(String[] args) {
////RESOURCE FOR MULTI THREADING
//        ArrayBlockingQueue<Integer> shared =  new ArrayBlockingQueue<Integer>(10);
////THREAD CREATION
//        producer a = new producer(shared);
//        consumer c = new consumer(shared);
//        Thread producer = new Thread(a);
//        Thread consumer = new Thread(c);
//        producer.start();
//        consumer.start();
//    }
//}
////PRODUCER CLASS IMPLEMENTATION
//class producer implements Runnable{
//    ArrayBlockingQueue<Integer> shared;
//    int Max=10;
//    private int i =0;
//     boolean isfull=true;
//    public producer( ArrayBlockingQueue<Integer>shared)
//    {
//        this.shared=shared;
//    }
//    @Override
//    public void run() {
//        while(true) {
//            try {
//                produce(i++);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public void produce(int i) throws InterruptedException {
////USE OF SYNCHRONISED KEYWORD
//        synchronized (shared) {
//            while (shared.size()==Max) {
//                System.out.println("produced 10 product waiting for consumer");
//                shared.wait();
//        }}
//        synchronized (shared)
//        {
//            shared.put(i);
//            System.out.println("produced item " + i);;
//            thread.sleep(1000);
//            shared.notify();
//        }
//    }
//}
////CONSUMER CLASS IMPLEMENTATION
//class consumer implements Runnable{
//    ArrayBlockingQueue<Integer> shared;
//    public consumer( ArrayBlockingQueue<Integer>shared)
//    {
//        this.shared=shared;
//    }
//    @Override
//    public void run() {
//        while(true) {
//            try {
//                consume();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public void consume() throws InterruptedException {
//        //USE OF SYNCHRONISED KEYWORD
//        synchronized (shared) {
//            while (shared.isEmpty()) {
//                System.out.println("all are consumed waiting for producer");
//                shared.wait();
//            }
//        }
//        synchronized (shared)
//        {
//            shared.take();
//            System.out.println("consumed item ");
//            thread.sleep(1000);
//            shared.notify();
//        }
//    }
//}

