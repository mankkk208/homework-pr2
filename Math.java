package PR2.w4;

import java.util.*;

public class Math {
    static Scanner sc = new Scanner(System.in);
    static int[] userArray;

    public static void displayMenu(int options[], String features[]) {
        System.out.println("M E N U");
        System.out.println("====================================");
        // loop through options and features
        for (int i = 0; i < options.length; i++) {
            System.out.printf("%d. %s\n", options[i], features[i]);
        }
        // print the exit option
        System.out.printf("%d. Exit\n",options.length + 1);
        System.out.println("====================================");
        System.out.print("Enter choice: ");
    }

    public static void main(String[] args) {
        int choice;
        //options and features of menu choices
        int options[] = {1, 2, 3, 4, 5};
        String features[] = {"remainder", "div", "middle", "isPalindrome", "isPrime"};
        
        int EXIT = options.length + 1;
        displayMenu(options, features);
        choice = sc.nextInt();
        // loop the choices
        while (choice != EXIT) {
            switch (choice) {
                case 1:
                remainder();
                break;
    
                case 2:
                div();
                break;
    
                case 3:
                middle();
                break;
    
                case 4:
                isPalindrome();
                break;

                case 5:
                isPrime();
                break;

                default:
                break;
            }
        
            displayMenu(options, features);
            choice = sc.nextInt();
        }
        sc.close();
    }
    
    /**
	 * @requires two integer as dividend and divisor
	 * @effects Find the remainder
	 */
    public static void remainder() {
        System.out.println("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter divisor: ");
        int divisor = sc.nextInt();
        while (dividend > divisor) {
            dividend = dividend - divisor;
        }
        System.out.println("The remainder is: " + dividend);
    }

    /**
	 * @requires two integer as dividend and divisor
	 * @effects Find the quotient
	 */
    public static void div() {
        int quotient = 0;
        System.out.println("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter divisor: ");
        int divisor = sc.nextInt();
        while (dividend > divisor) {
            dividend = dividend - divisor;
            quotient++;
        }
        System.out.println("The quotient is: " + quotient);
    }

    /**
	 * @requires an array of 3 integer
	 * @effects Find the middle number
	 */
    public static void middle() {
        int[] nums = new int[3];
        System.out.println("Enter 3 numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        java.util.Arrays.sort(nums);
        System.out.println("The middle number is: " + nums[1]);
    }
    
    /**
	 * @requires an integer
	 * @effects check if the integer is palindrome or not
	 */
    public static void isPalindrome() {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        //conversion of int to string
        String originalS = String.valueOf(n);
        // reversing the input string
        String reverseS = new StringBuilder(originalS).reverse().toString(); 
        // checking for Palindrome
        if (reverseS.equals(originalS)) {
            System.out.println(n + " is Palindrome");
        } else {
            System.out.println(n+ " is not Palindrome");
        }
    }
    
    /**
	 * @requires an integer
	 * @effects check if the integer is prime or not
	 */
    public static void isPrime() {
        int count = 0;
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");
    }
}