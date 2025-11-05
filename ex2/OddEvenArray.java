import java.util.*;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        List<Integer> oddarray = new ArrayList<>();
        List<Integer> evenarray = new ArrayList<>();

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num % 2 == 0)
                evenarray.add(num * num * num);
            else
                oddarray.add(num * num);
        }

        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }

        System.out.print("\nOdd Array: ");
        for (int i = 0; i < oddarray.size(); i++) {
            System.out.print(oddarray.get(i));
            if (i < oddarray.size() - 1) System.out.print(",");
        }

        System.out.print("\nEven Array: ");
        for (int i = 0; i < evenarray.size(); i++) {
            System.out.print(evenarray.get(i));
            if (i < evenarray.size() - 1) System.out.print(",");
        }
    }
}


// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 2
// Question 8