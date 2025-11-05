import java.util.Scanner;

class BankAccount {
    private int accountNumber; private String holderName; private double balance;
    public BankAccount(int n,String h,double b){ accountNumber=n; holderName=h; balance=b; }
    public void deposit(double a){ if(a>0) balance+=a; }
    public void withdraw(double a){ if(a>0 && a<=balance) balance-=a; }
    public void display(){ System.out.println("\nAccount: "+accountNumber+"\nHolder: "+holderName+"\nBalance: ₹"+balance); }
}

public class BankAccountdemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Acc1 No: "); int a1=sc.nextInt(); sc.nextLine();
        System.out.print("Holder1: "); String h1=sc.nextLine();
        System.out.print("Bal1: "); double b1=sc.nextDouble();
        BankAccount acc1=new BankAccount(a1,h1,b1);

        System.out.print("Acc2 No: "); int a2=sc.nextInt(); sc.nextLine();
        System.out.print("Holder2: "); String h2=sc.nextLine();
        System.out.print("Bal2: "); double b2=sc.nextDouble();
        BankAccount acc2=new BankAccount(a2,h2,b2);

        int c; do{
            System.out.println("\n1.Deposit1 2.Withdraw1 3.Deposit2 4.Withdraw2 5.View 6.Exit");
            c=sc.nextInt();
            switch(c){
                case 1: System.out.print("Amt: "); acc1.deposit(sc.nextDouble()); acc1.display(); break;
                case 2: System.out.print("Amt: "); acc1.withdraw(sc.nextDouble()); acc1.display(); break;
                case 3: System.out.print("Amt: "); acc2.deposit(sc.nextDouble()); acc2.display(); break;
                case 4: System.out.print("Amt: "); acc2.withdraw(sc.nextDouble()); acc2.display(); break;
                case 5: acc1.display(); acc2.display(); break;
            }
        }while(c!=6);
        sc.close();
    }
}


// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 4
// Question 1
