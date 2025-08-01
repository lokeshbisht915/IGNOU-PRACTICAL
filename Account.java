//  1. Write a Java program to create Account class. Define appropriate
// constructor for this class. Define methods Display_Account_Detail and
// Account_Balance in Account class. Inherit Saving Account class from
// Account class. Define constructor for Saving Account class. Also override
// Display Account_Detail method in Saving Account class. Make
// necessary assum

public class Account{
    public String accountHolderName;
    public int accountNumber;
    public double balance;

    //constructor to intialize
    public Account(String name, int number, double initialBalance){
        accountHolderName = name;
        accountNumber = number;
        balance = initialBalance;
    }

    //method to initiallize account details
    public void Display_Account_Detail(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);

    }

    public void Display_Account_Balance(){
        System.out.println("Account Balance: " + balance);

    }


    

 public static void main(String[] args){
        //Creating an object of Account class
        Account myAccount = new Account("Lokesh Bisht",345432389,1001.99);
        myAccount.Display_Account_Detail();
        myAccount.Display_Account_Balance();
        System.out.println("THe account number is: " + myAccount.accountNumber);
        System.out.println("THe account balance is: " + myAccount.balance);

 }   
 }