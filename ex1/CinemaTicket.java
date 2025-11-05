import java.util.*;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basePrice = 200;
        double finalPrice = basePrice;

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the day of booking: ");
        String day = sc.nextLine().trim().toLowerCase();

        if (age < 5) {
            finalPrice = 0;
        } else if (age >= 5 && age <= 18) {
            finalPrice = basePrice * 0.6;
        } else if (age > 60) {
            finalPrice = basePrice * 0.7;
        }

        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday")
                || day.equals("thursday") || day.equals("friday")) {
            finalPrice *= 0.9;
        }

        if (finalPrice == 0)
            System.out.println("Ticket is Free");
        else
            System.out.println("Ticket Price: ₹" + finalPrice);
    }
}



// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 1
// Question 1
