package arraysPractice;

import java.util.Scanner;

public class ArraysHomePractice {
    Scanner scanner = new Scanner(System.in);

    //task1
    void sumOfOddIndex() {
        int[] nums = {2, 4, 6, 8, 1, 3, 5, 7};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        System.out.println("Sum: " + sum);
    }

    //task2
    void sumOfDivisibleByThree() {
        int counter = 0;
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter value: ");
            nums[i] = scanner.nextInt();
            scanner.nextLine();
            if (nums[i] % 3 == 0 || nums[i] == 0) {
                counter++;
            }
        }
        System.out.println("Count: " + counter);

    }

    //task3
    void firstMatchingVal() {
        int[] nums = {5, 2, 8, 2, 7};
        System.out.print("Enter value: ");
        int val = scanner.nextInt();
        System.out.println("Search " + val);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                System.out.print("Index: " + val);
                return;
            }
        }

    }

    //task4
    void aboveLim() {
        int[] nums = {4, 12, 7, 20, 3};
        System.out.print("Enter value: ");
        int val = scanner.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > val) {
                nums[i] = val;
            }
        }
    }

    //task5
    void avgOfPrices() {
        int[] array = {100, 200, 12, 222, 333, 4556};

        int total = 0;
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        avg = total / array.length;
        System.out.println("Total is: " + total);
        System.out.println("Avg price is: " + avg);
    }


    //task6
    void checkHowManyPassed() {
        int[] scores = new int[6];
        int counter = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter value: ");
            scores[i] = scanner.nextInt();
            if (scores[i] < 0 || scores[i] > 100) {
                System.out.println("Invaild value");
                return;
            }
            if (scores[i] >= 60) {
                counter++;
            }
        }
        System.out.println("Passed: " + counter);
    }

    //task 7
    void doubledArray() {
        int[] array = {1, 3, 5, 2, 4, 6};
        System.out.print("original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
            array[i] *= 2;
        }

        System.out.print("\nDoubled:");
        for (int nums : array) {
            System.out.print(" " + nums);
        }
    }


    //task8
    void checkValuesByIndex() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] nums1 = {1, 2, 3, 6, 5, 4};
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums1[i]) {
                counter++;
            }

        }
        System.out.println("Matches: " + counter);

    }


    //task9
    void sumOfSeparateRow() {
        int[][] nums = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}
        };
        for (int i = 0; i < nums.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                rowSum += nums[i][j];
            }
            System.out.println("Sum of row " + i + " = " + rowSum);
        }

    }


//task10
    void biggestInEachRow() {
        int[][] matrix = {
                {2, 8, 3, 1},
                {9, 4, 6, 5},
                {7, 0, 11, 2}
        };

        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.print("Max for row " + i + " is: " + max);
        }
    }
}
