import java.util.*;

public class CharacterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the characters: ");
        String input = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        char[] arr = input.toCharArray();
        Set<Character> duplicates = new LinkedHashSet<>();
        Set<Character> seen = new HashSet<>();

        int vowels = 0, consonants = 0;

        for (char c : arr) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;

                if (!seen.add(c))
                    duplicates.add(c);
            }
        }

        System.out.print("Duplicate Characters are: ");
        int count = 0;
        for (char d : duplicates) {
            System.out.print(d);
            count++;
            if (count < duplicates.size()) System.out.print(", ");
        }

        System.out.println("\nNumber of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}



// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 2
// Question 5