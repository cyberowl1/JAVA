package com.example.projectcwh;
import java.util.*;


class GeometricObjects{
    private String color;
    private Date dateCreate = new Date();
//Default Constructor of parent class
    public GeometricObjects() {

        this.color = "white";
        this.dateCreate = new Date();
    }

//constructor called by using super keyword
    public GeometricObjects(String color) {
        this.color = color;

    }
//Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }




}

class RightAngleTriangle extends GeometricObjects{

    double baze, hite;



    public RightAngleTriangle() {
        this.baze = 3.0;
        this.hite=5.0;
    }

    RightAngleTriangle(double baze, double hite) {
        this.baze = baze;
        this.hite = hite;
    }
    //Using super keyword to call parametrized constructor from parent class
    RightAngleTriangle(double baze, double hite,String color) {
        super(color);
        this.baze = baze;
        this.hite = hite;
    }


//Getters ans Setters
    public double getBaze() {
        return baze;
    }

    public void setBaze(double baze) {
        this.baze = baze;
    }

    public double getHite() {
        return hite;
    }

    public void setHite(double hite) {
        this.hite = hite;
    }
//Method to get area of triangle
public double getArea()
{
    return (baze*hite)/2;
}
//Method to print all details of object
void printData()
{
    System.out.println("---->Details of object are<-----");
    System.out.println("Height: "+ this.getHite() + " | " + "Base:"+ this.getHite());
    System.out.println("Color Assigned:"+ this.getColor() +" | " + " Date of Creation:" + this.getDateCreate());
    System.out.println("Area of Triangle is :"+ this.getArea());
}
}
public class problem2 {
    public static void main(String[] args) {
       RightAngleTriangle r1 = new RightAngleTriangle(3.0,4,"blue");
      r1.printData();
    }
}
