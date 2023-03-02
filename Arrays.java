package PR2.w4;

import java.util.*;

public class Arrays {
    static Scanner sc = new Scanner(System.in);
    static int[] userArray;

    public static void displayMenu(int options[], String features[]) {
        System.out.println("M E N U");
        System.out.println("====================================");
        //Loop through options and features
        for (int i = 0; i < options.length; i++) {
            System.out.printf("%d. %s\n", options[i], features[i]);
        }
        //Print the exit option
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
        int options[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String features[] = {"countNegatives", "countEvens", "divArray", "min", "isAscSorted", "length", "median", "compare", "freq"};
        
        int EXIT = options.length + 1;
        inputArrays();
        displayMenu(options, features);
        choice = sc.nextInt();
        //Loop the choices
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
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] / div + " ");
        }
    }

    public static void min(int[] userArray) {
        java.util.Arrays.sort(userArray);
        System.out.println("The minimum element is: " + userArray[0]);
    }

    public static void isAscSorted(int[] userArray) {
        int[] temp = userArray;
        java.util.Arrays.sort(userArray);
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
        int SecArrLength = sc.nextInt();
        int[] comparedArr = new int[SecArrLength];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < SecArrLength; i++) {
            comparedArr[i] = sc.nextInt();
        }
        System.out.println("Arrays elements are: ");
        for (int i = 0; i < comparedArr.length; i++) {
            System.out.print(comparedArr[i] + " ");
        }
        System.out.println();
    }

    public static void freq(int[] userArray) {   

    }
}

