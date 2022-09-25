package com.example.projectcwh;
import java.util.*;

public class Employee
{

    int empno;
    String name;
    String company_name;

    double Basic;
    double D;
    double HRA;
    double gross_sal;
    String Department;
    String Company;


     Employee(int no, String dept, String name, String company, double salary)
     {
        this.empno = no;
        this.name = name;
        this.Company = company;
        this.Department = dept;
        this.Basic = salary;
        this.D = (120.0/100.0) * Basic;
        this.HRA = (20.0 / 100.0) * Basic;
        this.gross_sal = Basic + D + HRA;
    }



    void setCompany(String company)
    {
        this.company_name = company;
    }

    void setname(String name)
    {
        this.name = name;
    }

    static class Sortbydept implements Comparator<Employee>
    {
        // Used for sorting in ascending order of department

        public int compare(Employee a, Employee b)
        {
             return a.Department.compareTo(b.Department);
        }
    }
    // Used for sorting in descending  order of empno a comparator

    static class Sortbyempno implements Comparator<Employee>
    {

        public int compare(Employee a, Employee b)
        {
            return b.empno - a.empno;
        }
    }




    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        creating employee data
       Employee E1 = new Employee(1,"ADMIN","satyam","bluetech",17000);
        Employee E2 = new Employee(2,"MANAGER","ABHI","bluetech",16000);
        Employee E3 = new Employee(3,"PROMOTION","ARJITA","bluetech",13000);
        Employee E4 = new Employee(4,"BRANDING","RITIK","bluetech",11000);
        Employee E5 = new Employee(5,"CONTENT","PRIYA","bluetech",15000);
        Employee E6 = new Employee(6,"MARKETER","MACK","bluetech",14000);


//adding employee data to arraylist
        ArrayList<Employee> emp=new ArrayList<Employee>();
        emp.add(E1);
        emp.add(E2);
        emp.add(E3);
        emp.add(E4);
        emp.add(E5);


//         case control
        System.out.println("ENTER YOUR CHOICES");
        System.out.println("1. Input n employees record");
        System.out.println("2.To search employees record");
        System.out.println("3. Display data sorted by department in ascend.");
        System.out.println("4. Display data sorted by empno in descending order");



        int s = sc.nextInt();
        switch (s){
            case 1:
        System.out.println("Unsorted");
        for (int i = 0; i < emp.size(); i++)
            System.out.println(emp.get(i));
// creating iteration for showing data stored in arraylist.
        Iterator itr= emp.iterator();

        while(itr.hasNext()) {
            Employee st = (Employee) itr.next();
            System.out.println(st.empno + " " + st.name + " " + st.Company + " " + st.Basic + " " + st.D + " " + st.Department + " " + st.gross_sal);


        }
         break;


case 2:
    boolean retval = emp.contains(1);
    System.out.println(retval);
    break;
// code to sort by dept
            case 3:
        Collections.sort(emp, new Sortbydept());


        Iterator it= emp.iterator();

        while(it.hasNext()) {
            Employee st = (Employee) it.next();
            System.out.println(st.empno + " " + st.name + " " + st.Company + " " + st.Basic + " " + st.D + " " + st.Department + " " + st.gross_sal);

        }

           break;




//code to sort by emp no in descending
//
 case 4:
        Collections.sort(emp, new Sortbyempno());


        Iterator i= emp.iterator();

        while(i.hasNext()) {
            Employee st = (Employee) i.next();
            System.out.println(st.empno + " " + st.name + " " + st.Company + " " + st.Basic + " " + st.D + " " + st.Department + " " + st.gross_sal);
        }
        break;


        }}}













