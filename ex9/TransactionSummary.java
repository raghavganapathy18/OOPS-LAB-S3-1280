import java.io.*;

public class TransactionSummary {
    public static void main(String[] args){
        String input="transactions.txt",output="summary.txt";
        int success=0,failed=0;
        try{
            BufferedReader r=new BufferedReader(new FileReader(input));
            String line;
            while((line=r.readLine())!=null){
                String[] p=line.split("\\|");
                if(p.length==4){
                    if(p[3].equalsIgnoreCase("SUCCESS")) success++;
                    else if(p[3].equalsIgnoreCase("FAILED")) failed++;
                }
            }
            r.close();
            BufferedWriter w=new BufferedWriter(new FileWriter(output));
            w.write("=== DAILY TRANSACTION SUMMARY ===\n");
            w.write("Total Transactions: "+(success+failed)+"\n");
            w.write("Successful Transactions: "+success+"\n");
            w.write("Failed Transactions: "+failed+"\n");
            w.close();
            System.out.println("Summary generated.");
        }catch(Exception e){ System.out.println(e); }
    }
}


// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 9
// Question 1
