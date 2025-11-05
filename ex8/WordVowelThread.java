import java.util.Scanner;

class WordThread implements Runnable {
    String text; WordThread(String t){ text=t; }
    public void run(){ for(String w:text.split(" ")){ System.out.println(w); try{Thread.sleep(2000);}catch(Exception e){} } }
}

class VowelThread implements Runnable {
    String text; VowelThread(String t){ text=t; }
    public void run(){ for(char c:text.toCharArray()) if("aeiouAEIOU".indexOf(c)!=-1){ System.out.println(c); try{Thread.sleep(2000);}catch(Exception e){} } }
}

public class WordVowelThread {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String para=sc.nextLine();
        new Thread(new WordThread(para)).start();
        new Thread(new VowelThread(para)).start();
        sc.close();
    }
}



// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 8
// Question 1
