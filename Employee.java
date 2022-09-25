import java.util.Scanner;

public class Employee {
    static int[] empno = new int[100];
    static int[] sempno = new int[100];
    static String[] empname = new String[100];
    static String[] dept = new String[100];
    static String company_name;
    static String[] deptname = new String[5];
    static double[] basic = new double[100];
    static double[] DA = new double[100];
    static double[] HRA = new double[100];
    static double[] gross_sal = new double[100];
    static int c,n,eno,i,ch;
    static int len = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter company name: ");
        company_name = in.nextLine();
        System.out.println("Enter the names of departments: ");
        for(i=0;i<5;i++){
            System.out.print("Enter department "+(i+1)+" : ");
            deptname[i] = in.nextLine();
        }

        do{
            System.out.println();
            System.out.println("MENU: ");
            System.out.println();
            System.out.println(" 1) Input n employee record");
            System.out.println(" 2) Search employee by empno (table form)");
            System.out.println(" 3) Display employee data sorted by dept (table form)");
            System.out.println(" 4) Display employee data sorted by empno in descending order (table form)");
            System.out.println(" 5) Exit");
            System.out.println();
            System.out.print("Enter a choice: ");
            c = in.nextInt();
            System.out.println();
            switch(c){
                case 1:
                    System.out.print("How many records do you want to enter: ");
                    n = in.nextInt();
                    for(i=len;i<len+n;i++){
                        System.out.println("Enter data of employee "+(i+1)+" : ");
                        System.out.print("Employee no: ");
                        empno[i] = in.nextInt();
                        in.nextLine();
                        sempno[i] =empno[i];
                        System.out.print("Employee name: ");
                        empname[i] = in.nextLine();
                        System.out.print("Select a department: ");
                        System.out.println();
                        System.out.println(" 1) "+deptname[0]);
                        System.out.println(" 2) "+deptname[1]);
                        System.out.println(" 3) "+deptname[2]);
                        System.out.println(" 4) "+deptname[3]);
                        System.out.println(" 5) "+deptname[4]);
                        ch = in.nextInt();
                        switch(ch){
                            case 1:
                                dept[i] = deptname[0];
                                break;
                            case 2:
                                dept[i] = deptname[1];
                                break;
                            case 3:
                                dept[i] = deptname[2];
                                break;
                            case 4:
                                dept[i] = deptname[3];
                                break;
                            case 5:
                                dept[i] = deptname[4];
                                break;
                        }
                        System.out.print("Basic (1000-15000) : ");
                        basic[i] = in.nextDouble();
                        while(basic[i]<1000||basic[i]>15000){
                            System.out.print("Enter basic again!!! (should be between 1000 and 15000) : ");
                            basic[i] = in.nextDouble();
                        }
                        DA[i] = (1.2)*basic[i];
                        HRA[i] = (0.2)*basic[i];
                        gross_sal[i] = basic[i] + DA[i] + HRA[i];
                    }
                    len += n;
                    break;
                case 2:
                    System.out.print("Enter the employee no. of the employee to be searched: ");
                    eno = in.nextInt();
                    for(i = 0;i<100;i++){
                        if(empno[i]==eno){
                            System.out.println();
                            System.out.println("!! Employee found !!");
                            System.out.println();
                            System.out.println("Employee no: "+empno[i]);
                            System.out.println("Employee name: "+empname[i]);
                            System.out.println("Employee department: "+dept[i]);
                            System.out.println("Company name: "+ company_name);
                            System.out.println("Salary: "+gross_sal[i]);
                            break;
                        }
                    }
                    System.out.println();
                    if(i==100){
                        System.out.println("!!!Employee not found!!!");
                    }
                    break;
                case 3:
                    System.out.println("Employee data sorted by department: ");
                    System.out.println();
                    System.out.println("Employees in "+deptname[0]);
                    for(i=0;i<len;i++){
                        if(deptname[0]==dept[i]){
                            System.out.println();
                            System.out.println("Employee no: "+empno[i]);
                            System.out.println("Employee name: "+empname[i]);
                            System.out.println("Employee department: "+dept[i]);
                            System.out.println("Company name: "+ company_name);
                            System.out.println("Salary: "+gross_sal[i]);
                        }
                    }
                    System.out.println();
                    System.out.println("Employees in "+deptname[1]);
                    for(i=0;i<len;i++){
                        if(deptname[1]==dept[i]){
                            System.out.println();
                            System.out.println("Employee no: "+empno[i]);
                            System.out.println("Employee name: "+empname[i]);
                            System.out.println("Employee department: "+dept[i]);
                            System.out.println("Company name: "+ company_name);
                            System.out.println("Salary: "+gross_sal[i]);
                        }
                    }
                    System.out.println();
                    System.out.println("Employees in "+deptname[2]);
                    for(i=0;i<len;i++){
                        if(deptname[2]==dept[i]){
                            System.out.println();
                            System.out.println("Employee no: "+empno[i]);
                            System.out.println("Employee name: "+empname[i]);
                            System.out.println("Employee department: "+dept[i]);
                            System.out.println("Company name: "+ company_name);
                            System.out.println("Salary: "+gross_sal[i]);
                        }
                    }
                    System.out.println();
                    System.out.println("Employees in "+deptname[3]);
                    for(i=0;i<len;i++){
                        if(deptname[3]==dept[i]){
                            System.out.println();
                            System.out.println("Employee no: "+empno[i]);
                            System.out.println("Employee name: "+empname[i]);
                            System.out.println("Employee department: "+dept[i]);
                            System.out.println("Company name: "+ company_name);
                            System.out.println("Salary: "+gross_sal[i]);
                        }
                    }
                    System.out.println();
                    System.out.println("Employees in "+deptname[4]);
                    for(i=0;i<len;i++){
                        if(deptname[4]==dept[i]){
                            System.out.println();
                            System.out.println("Employee no: "+empno[i]);
                            System.out.println("Employee name: "+empname[i]);
                            System.out.println("Employee department: "+dept[i]);
                            System.out.println("Company name: "+ company_name);
                            System.out.println("Salary: "+gross_sal[i]);
                        }
                    }
                    break;
                case 4:
                    for(int i=0;i<len;i++){
                        for(int j=i+1;j<len;j++){
                            if(sempno[i]<sempno[j]){
                                int t = sempno[i];
                                sempno[i] = sempno[j];
                                sempno[j] = t;
                            }
                        }
                    }
                    System.out.println("Employee data sorted by empno (descending order): ");
                    System.out.println();
                    for(int i=0;i<len;i++){
                        for(int j = 0;j<len;j++){
                            if(sempno[i]==empno[j]){
                                System.out.println();
                                System.out.println("Employee no: "+empno[j]);
                                System.out.println("Employee name: "+empname[j]);
                                System.out.println("Employee department: "+dept[j]);
                                System.out.println("Company name: "+ company_name);
                                System.out.println("Salary: "+gross_sal[j]);
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("!!! EXIT !!!");
                    break;
                default:
                    System.out.println("Choose a valid option!!");

            }
        }while(c!=5);
    }
}