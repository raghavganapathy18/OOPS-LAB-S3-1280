import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(rev))
            System.out.println("The given string is a PALINDROME");
        else
            System.out.println("The given string is not a PALINDROME");
    }
}

// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 3
// Question 10