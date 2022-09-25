package com.example.projectcwh;

public class Circles {

    int radius;
    Circles()
    {
        radius = 0;
    }
    Circles(int r)
    {
        radius = r;
    }
    void printData()
    {
        System.out.println("radius = "+ radius);
    }
    void printArea()
    {

        System.out.println("area = "+ (3.14*radius*radius));
    }
    void printPerimeter()
    {

        System.out.println("perimeter = "+ (3.14*radius*2));
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Circles c1 = new Circles();
        Circles c2 = new Circles(4);
        System.out.println("-----for default--------");
        c1.printData();
        c1.printArea();
        c1.printPerimeter();
        System.out.println("\n----------for parameterized-------");
        c2.printData();
        c2.printArea();
        c2.printPerimeter();
    }}

