package automation;

public class BankAccount {
    public int accountBalance;

    //Konstruktor bezparametrowy//

    public BankAccount(){
        this.accountBalance = 0;
    }
    //Konstruktor parametrowy//
    public BankAccount(int accountBalance){
        this.accountBalance = accountBalance;
    }

    //Metoda pierwsza//
    public boolean withdraw(int amount){
        if (amount > this.accountBalance){
            return false;
        } this.accountBalance -= amount;
            return true;
    }
    //Metoda druga
    public void transfer(int amount){
        this.accountBalance += amount;
    }

    //Metoda trzecia
    public int getAccountBalance(){
        return this.accountBalance;
    }
}
