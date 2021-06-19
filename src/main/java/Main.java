public class Main {
    public static void main(String[] args) {
        BankAccount Super = new BankAccount(500);
        Super.transfer(50);
        Super.withdraw(24);
        Super.transfer(230);
        Super.getAccountBalance();
        Super.withdraw(20000);
    }
}
