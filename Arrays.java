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

    public static void countNegatives(int[] userArray) {
        int count = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] < 0) {
                count++;
            }
        }
        System.out.println("The numbers of negative numbers: " + count);
    }

    public static void countEvens(int[] userArray) {
        int count = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("The numbers of even numbers: " + count);
    }

    public static void divArray(int[] userArray) {
        System.out.print("Enter a number to divide: ");
        int div = sc.nextInt();
        //loop through all elements and divide them
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] / div + " ");
        }
    }

    public static void min(int[] userArray) {
        //sort the userArray in ascending order then take the first element
        java.util.Arrays.sort(userArray);
        System.out.println("The minimum element is: " + userArray[0]);
    }

    public static void isAscSorted(int[] userArray) {
        //initialize a temporary array to hold the sorted version of userArray
        int[] temp = userArray;
        java.util.Arrays.sort(userArray);
        //compare 2 array to see if userArray is in ascending order
        if (temp == userArray) {
            System.out.println("In ascending order!");
        } else {System.out.println("Not in ascending order!");}
    }

    public static void length(int[] userArray) {
        
    }

    public static void median(int[] userArray) {
        int n = userArray.length / 2;
        if (userArray.length % 2 == 0) {
            System.out.println("The median elements are: " + userArray[n] + "," + userArray[n + 1]);
        } else {
            System.out.println("The median element is: " + userArray[n + 1]);
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

    public static void freq(int[] userArray) {   
        // initialize a boolean array with the same length as userArray
        boolean visited[] = new boolean[userArray.length];     
        java.util.Arrays.fill(visited, false);
 
        // Traverse through array elements and count frequencies
        for (int i = 0; i < userArray.length; i++) {
            //skip the visited elements
            if (visited[i] == true)
                continue;
 
            // Count frequency
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

