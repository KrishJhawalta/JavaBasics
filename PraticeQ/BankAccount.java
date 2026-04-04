public class BankAccount{
    public int Balance = 10000;

    int deposit(int amount){
       
        return Balance += amount;}

    int withdrawl(int raw){
        return Balance -= raw;
    }

    int checkBalance(){
        return Balance;
        
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        System.out.println("Enter amount :"+b1.deposit(500));
        System.out.println("Enter withdraw: "+b1.withdrawl(1000));
        System.out.println("Check balance: "+b1.checkBalance());
    }
}