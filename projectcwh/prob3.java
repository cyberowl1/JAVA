package com.example.projectcwh;

 class person {

    private String name, address, phone, email;

    public person(){
    }

    public person(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return phone;
    }

    public void setEmail(String email){
        this.email = email;
    }
     void printData()
     {
         System.out.println("\nName: "+name + "\nAddress: "+ address + "\nEmail Address:"+ email +"\n phone: "+ phone);
     }

    @Override
    public String toString(){
        return getClass().getName() + "\n" + name;
    }
}

 class student extends person{

    private final String CLASS_STATUS;
     public student(String CLASS_STATUS){
         this.CLASS_STATUS =CLASS_STATUS;
     }

     public student(String name, String s, String s1, String s2, String s3) {
         super(name,s,s1,s2);
         this.CLASS_STATUS=s3;
     }


     public String getClassStatus(){
        return CLASS_STATUS;
    }
     void printData()
     {
         super.printData();
         System.out.println("Status: "+CLASS_STATUS);
     }
}

 class employee extends person{
    private String office,salary;
    private MyDate DATE_HIRED;

    public employee(){
    }

    public employee(String office, String salary, MyDate DATE_HIRED){
        this.office = office;
        this.salary = salary;
        this.DATE_HIRED = DATE_HIRED;
    }

     public employee(String s, String s1, String s2, String s3) {
         super(s,s1,s2,s3);
     }

     public String office(){
        return office;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public String getSalary(){
        return salary;
    }

    public void setSalary(String salary){
        this.salary = salary;
    }

    public MyDate getMyDate(){
        return DATE_HIRED;
    }


     void printData()
     {
         super.printData();
         System.out.println("Office: "+ office+"\nSalary: "+salary+"\n " + "Date of Joining" + DATE_HIRED);
     }
 }

 class MyDate{
    private int month, day, year;

    public MyDate(int month, int day, int year){
        this.day = day;
        this.month =month;
        this.year = year;
    }
}

 class faculty extends employee {
    private String office_hours, rank;
    public faculty(){
    }

    public faculty(String office_hours, String rank){
        this.office_hours = office_hours;
        this.rank = rank;
    }

     public faculty(String name, String s, String s1, String s2) {
        super(name,s,s1,s2);
     }

     public String getOfficeHours(){
        return office_hours;
    }

    public void setOfficeHours(String office_hours){
        this.office_hours = office_hours;
    }

    public String getRank(){
        return rank;
    }

    public void setRank(String rank){
        this.rank = rank;
    }
     public void printData() {
    super.printData();
System.out.println("Office Hours: "+office_hours+"\nRank: "+rank);
 }
}

 class staff extends employee{
    private String title;

    public staff(){
    }

    public staff(String title){
        this.title = title;
    }

     public staff(String s, String s1, String s2, String s3) {
        super(s,s1,s2,s3);
     }

     public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title =title;
    }
     void printData() {
         super.printData();
         System.out.println("Title: "+title);
     }
}

public class prob3 {
    public static void main(String[] args) {
        person person = new person("SATYAM", "123 Somewhere", "415-555-1212", "satyam@somewhere.com");
        person student = new  student(" SUMIT", "555 School Street", "650-555-1212", "sumit@abc.com", "junior");
        person employee = new employee("Tom CRUISE", "777 B Street", "408-888-9999", "tc@xyz.com");
        person faculty = new faculty("ABC DEF", "999 Park Ave", "925-222-3333", "abc@abcxyz.com");
        person staff = new staff("Jack I. Box", "21 Jump Street", "707-212-1112", "jb@jack.com");

       student.printData();

    }
}
