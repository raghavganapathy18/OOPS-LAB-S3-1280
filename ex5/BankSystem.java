import java.util.Scanner;

class Account {
    String cust_name; int accno; double balance;
    public Account(String n, int a, double b) { cust_name=n; accno=a; balance=b; }
    public void viewBalance() { System.out.println("Balance: ₹" + balance); }
    public void deposit(double a) { balance += a; viewBalance(); }
    public void withdraw(double a) { if(balance>=a) balance-=a; viewBalance(); }
}

class SavingsAccount extends Account {
    double rate=6;
    public SavingsAccount(String n,int a,double b){ super(n,a,b); }
    public void withdraw(double a){ if(balance>=a) balance-=a; else System.out.println("Overdraw not allowed!"); viewBalance(); }
    public void deposit(double a){ double i=(a*rate)/100; balance+=a+i; viewBalance(); }
}

class CurrentAccount extends Account {
    double serviceCharge=3.5;
    public CurrentAccount(String n,int a,double b){ super(n,a,b); }
    public void withdraw(double a){
        if(a>balance){ double over=a-balance; double ch=(over*serviceCharge)/100; balance-=(a+ch); }
        else balance-=a; viewBalance();
    }
}

public class BankSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Name: "); String name=sc.nextLine();
        System.out.print("Acc No: "); int acc=sc.nextInt();
        System.out.print("Balance: "); double bal=sc.nextDouble();
        System.out.println("1.Savings  2.Current"); int c=sc.nextInt();
        Account ac = (c==1)?new SavingsAccount(name,acc,bal):new CurrentAccount(name,acc,bal);
        int ch; do{
            System.out.println("\n1.View 2.Deposit 3.Withdraw 4.Exit");
            ch=sc.nextInt();
            if(ch==1) ac.viewBalance();
            else if(ch==2){ System.out.print("Amount: "); ac.deposit(sc.nextDouble()); }
            else if(ch==3){ System.out.print("Amount: "); ac.withdraw(sc.nextDouble()); }
        }while(ch!=4);
        sc.close();
    }
}




// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 5
// Question 1
