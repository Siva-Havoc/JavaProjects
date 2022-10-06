import java.util.*;
import java.lang.*;
public class BankApplication {
    int balance;
    int previousTransaction;
    String Cname;
    int Cid;
    public BankApplication(String cname,int cid)
    {
        Cname=cname;
        Cid=cid;
        balance=0;
    }
    void deposit(int amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            previousTransaction=amount;
        }
    }
    void withdraw(int amount)
    {
        if(amount>0)
        {
            balance=balance-amount;
            previousTransaction=-amount;
        }
    }
    void getPreviousTransaction()
    {
        if(previousTransaction>0)
        {
            System.out.println("Deposited :"+previousTransaction);
        }
        else if(previousTransaction<0)
        {
            System.out.println("Withdrawn :" + Math.abs(previousTransaction));
        }
        else
            System.out.println("No transaction is done");
    }

    void display()
    {
        Scanner scan=new Scanner(System.in);
        int num=0;
        System.out.println("Welcome "+Cname);
        System.out.println("Your Customer Id is "+Cid);
        System.out.println("/n1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Previous Transactions");
        System.out.println("5.exit");


        do {
            System.out.println("======================================");
            System.out.println("Enter your option");
            num=scan.nextInt();
            System.out.println("======================================");

            switch(num){
                case 1:
                    System.out.println("--------------------------------------");
                    System.out.println("Balance :"+balance);
                    System.out.println("--------------------------------------");
                    break;
                case 2:
                    System.out.println("Enter an amount to deposit :");
                    int a=scan.nextInt();
                    deposit(a);
                    break;
                case 3:
                    System.out.println("Enter the amount to Withdraw :");
                    int b=scan.nextInt();
                    withdraw(b);
                case 4:
                    System.out.println("--------------------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------------------");
                    break;
                default:
                    System.out.println("Enter the correct option");
            }

        }while(num >0 && num<5);
        System.out.println("Thank you for your services !!");
    }

}
class BankApp{
    public static void main(String [] args)
    {
        BankApplication bk=new BankApplication("Siva",2410);
        bk.display();
    }
}
