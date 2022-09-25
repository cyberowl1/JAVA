package com.example.projectcwh;

public class Rectangle {
    int length, breadth;

    Rectangle() {
        System.out.println("object createed");
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }
void PrintData()
{
    System.out.println("Length:"+this.length+"  "+ "Breadth:-"+this.breadth);
}

    void PrintArea() {
       System.out.println("Area:"+ length * breadth);
    }

    void PrintPerimemter() {
        System.out.println("Perimeter" + 2 * (length + breadth));
    }


    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2= new Rectangle(12,6);
     // object r1
        r1.length=4;
        r1.breadth=2;
        System.out.println("Printing Details of first Rectangle:-");
        r1.PrintData();
        r1.PrintArea();
        r1.PrintPerimemter();
        //object r2
        System.out.println("Printing Details of 2nd Rectangle:-");
        r2.PrintData();
        r2.PrintArea();
        r2.PrintPerimemter();

    }
}