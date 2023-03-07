package PR2.w4;

import java.util.*;

public class Arrays {
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

    public static void inputArrays() {
        // take array input from user
        System.out.println("Input the data: ");
        System.out.println("Enter the length of arrays: ");
        int arrLength = sc.nextInt();
        int[] tempArray = new int[arrLength];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arrLength; i++) {
            tempArray[i] = sc.nextInt();
        }
        userArray = tempArray;
        System.out.println("Arrays elements are: ");
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int choice;
        //options and features of menu choices
        int options[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String features[] = {"countNegatives", "countEvens", "divArray", "min", "isAscSorted", "length", "median", "compare", "freq"};
        
        int EXIT = options.length + 1;
        inputArrays();
        displayMenu(options, features);
        choice = sc.nextInt();
        //loop the choices
        while (choice != EXIT) {
            switch (choice) {
                case 1:
                countNegatives(userArray);
                break;
    
                case 2:
                countEvens(userArray);
                break;
    
                case 3:
                divArray(userArray);
                break;
    
                case 4:
                min(userArray);
                break;

                case 5:
                isAscSorted(userArray);
                break;

                case 6:
                length(userArray);
                break;

                case 7:
                median(userArray);
                break;

                case 8:
                compare(userArray);
                break;

                case 9:
                freq(userArray);
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
	 * Count the negative numbers
	 * @requires userArray is an integer array
	 * @effects Count then print the negative elements of userArray
	 */
    public static void countNegatives(int[] userArray) {
        int count = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] < 0) {
                count++;
            }
        }
        System.out.println("The numbers of negative numbers: " + count);
    }

    /**
	 * Count the even numbers
	 * @requires userArray is an array of positive integer numbers.
	 * @effects Count then print the even numbers of userArray
	 */
    public static void countEvens(int[] userArray) {
        int count = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("The numbers of even numbers: " + count);
    }

    /**
	 * Divide each elements with an input divisor
	 * @requires an array of real numbers
	 * @effects 
	 * 	Get the divisor from the input
	 * 	Each element is divided by the divisor
	 * 	Print the array after dividing to the console log
	 */
    public static void divArray(int[] userArray) {
        System.out.print("Enter a number to divide: ");
        int div = sc.nextInt();
        for (int i = 0; i < userArray.length; i++) {
            System.out.print((double) userArray[i] / div + " ");
        }
    }

    /**
	 * Compute the minimum elements
	 * @requires an array of integer numbers
	 * @effects sort the array then print the first element
	 */
    public static void min(int[] userArray) {
        java.util.Arrays.sort(userArray);
        System.out.println("The minimum element is: " + userArray[0]);
    }

    /**
	 * Check ascending order
	 * @requires an array of integer numbers
	 * @effects Check if the array is in ascending order or not
	 */
    public static void isAscSorted(int[] userArray) {
        int[] temp = userArray.clone();
        java.util.Arrays.sort(userArray);
        if (temp.equals(userArray)) {
            System.out.println("In ascending order!");
        } else {System.out.println("Not in ascending order!");}
    }

    public static void length(int[] userArray) {
        
    }

    /**
	 * @requires an array of real numbers
	 * @effects Find the median of the array
	 */
    public static void median(int[] userArray) {
        int n = userArray.length / 2;
        java.util.Arrays.sort(userArray);
        
        if (userArray.length % 2 == 0) {
            double m = (double) (userArray[n - 1] +  userArray[n])/2;
            System.out.println("The median elements are: " + m);
        } else {
            System.out.println("The median element is: " + userArray[n]);
        }
    }

    public static void compare(int[] userArray) {
        System.out.println("Input the data of compared array: ");
        System.out.println("Enter the length of arrays: ");
        int secArrLength = sc.nextInt();
        int[] secArray = new int[secArrLength];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < secArrLength; i++) {
            secArray[i] = sc.nextInt();
        }
        System.out.println("Arrays elements are: ");
        for (int i = 0; i < secArray.length; i++) {
            System.out.print(secArray[i] + " ");
        }
        System.out.println();


    }
    
    /**
	 * Find the frequency of each element
	 * @requires an array of real numbers
	 * @effects 
	 * 	Create a boolean array to check if an element is visited
	 * 	Loop through the array then count
	 * 	While in the loop, distinguish the dupplicate element 
	 * 	in order to not count the same element twice
	 * 	Print the result to the console log
	 */
    public static void freq(int[] userArray) {   
        boolean visited[] = new boolean[userArray.length];     
        java.util.Arrays.fill(visited, false);
 
        for (int i = 0; i < userArray.length; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < userArray.length; j++) {
                if (userArray[i] == userArray[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(userArray[i] + " appears " + count + " time");
        }
    }
}

