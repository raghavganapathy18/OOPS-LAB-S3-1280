import java.util.Scanner;

class EvenThread extends Thread {
    int[] arr; EvenThread(int[] a){ arr=a; }
    public void run(){ for(int n:arr) if(n%2==0){ System.out.println("Even: "+n); try{Thread.sleep(2000);}catch(Exception e){} } }
}

class OddThread extends Thread {
    int[] arr; OddThread(int[] a){ arr=a; }
    public void run(){ for(int n:arr) if(n%2!=0){ System.out.println("Odd: "+n); try{Thread.sleep(2000);}catch(Exception e){} } }
}

public class EvenOddThread {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[10];
        for(int i=0;i<10;i++) nums[i]=sc.nextInt();
        new EvenThread(nums).start();
        new OddThread(nums).start();
        sc.close();
    }
}



// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 8
// Question 2
