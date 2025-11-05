import java.util.Scanner;

class TableThread extends Thread {
    int num; TableThread(int n){ num=n; }
    public void run(){ for(int i=1;i<=10;i++){ System.out.println(num+" x "+i+" = "+(num*i)); try{Thread.sleep(2000);}catch(Exception e){} } }
}

class DivisorThread extends Thread {
    int num; DivisorThread(int n){ num=n; }
    public void run(){ for(int i=1;i<=num;i++) if(num%i==0){ System.out.println("Divisor: "+i); try{Thread.sleep(2000);}catch(Exception e){} } }
}

public class TableDivisorThread {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        new TableThread(n).start();
        new DivisorThread(n).start();
        sc.close();
    }
}


// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 8
// Question 3
