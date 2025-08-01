// Inherit Saving Account class from
// Account class. Define constructor for Saving Account class. Also override
// Display Account_Detail method in Saving Account class. Make
// necessary assum

public class savingAccounts extends Account {
    private double interestRate;

    public savingAccounts(String name,int number,double initialBalance, double interestRate){
        super(name, number, initialBalance); //call parent constructor
        this.interestRate = interestRate; 
    }

    //overring Display_Account_Detail method
    //Override

    public void Display_Account_Detail(){
        System.out.println("=== Saving Account Details ===");
        System.out.println("Account Holder Name:" + accountHolderName);
        System.out.println("Account Number:" + accountNumber);
        System.out.println("intrest rate" + interestRate);
        
    }
    public static void main(String[] args){
        //creating object savingAccounts
        savingAccounts savingAcc = new savingAccounts("lokesh bisht",100345676,100.1,0.9);

        //call overidden and inherited methods
        savingAcc.Display_Account_Detail();
        savingAcc.Display_Account_Balance();
    }
}