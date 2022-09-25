package com.example.projectcwh;

public class Accounts {
    String name;
    double balance;
    Accounts(double balance, String _name)
    {
        name = _name;
        balance = 0.0;
    }




    //    CREATING INSTANCE METHOD
    public void deposits(double amount){

        balance+=amount;
        System.out.println("DEPOSITION COMPLETE");
        System.out.println("Deposited amount" + amount);
        System.out.println("Balance " + getbalance());
        return;
    }
    public void withdraw(double amount){

        balance-=amount;
        System.out.println("withdraw COMPLETE");
        System.out.println("Withdrwan amount" + amount);
        System.out.println("Balance " + getbalance());
        return;
    }
    public Double getbalance()
    {
        return balance;
    }
    public void displaybalance()
    {
        System.out.println("Name:" +name +  "Balance:" +getbalance());
    }
    public static void main(String[] args) {
        System.out.println("BHARTI NANDAN");
       Accounts satyam = new Accounts(10.0, "Satyam");
       Accounts sudhanshu = new Accounts(10.0, "Sudhanshu");//CREATING INSTANCE
          satyam.deposits(500.00);
          satyam.withdraw(300.00);
           System.out.println();

           sudhanshu.deposits(500.00);
           sudhanshu.withdraw(400.00);
           System.out.println();
           satyam.displaybalance();
           sudhanshu.displaybalance();
    }


}
