import java.util.Scanner;

public class UniqueCharacterChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine().toLowerCase().replace(" ", "");
        boolean isPerfect = true; char repeat = '\0';
        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<input.length();j++){
                if(input.charAt(i)==input.charAt(j)){
                    isPerfect=false; repeat=input.charAt(i); break;
                }
            }
            if(!isPerfect) break;
        }
        if(isPerfect) System.out.println("Output: PERFECT");
        else System.out.println("Output: NOT PERFECT\nRepeating Character: " + repeat);
        sc.close();
    }
}




// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 3
// Question 3
