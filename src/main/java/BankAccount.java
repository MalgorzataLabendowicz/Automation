public class BankAccount {
    private int accountBalance;

    //Konstruktor bezparametrowy//

    public BankAccount(){accountBalance = 0;
    }
    //Konstruktor parametrowy//
    public BankAccount(int accountBalance){
        this.accountBalance = accountBalance;
    }
    //Metoda pierwsza//
    public boolean withdraw(int amount){

        if (amount > accountBalance){
            return false;
        }
        else{
            accountBalance = accountBalance - amount;
            return true;
        }
    }
    //Metoda druga
    public void transfer(int amount){
        accountBalance += amount;
    }
    //Metoda trzecia
    public int getAccountBalance(){
        return(accountBalance);
    }
}
