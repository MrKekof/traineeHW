package arraysPractice;

import java.util.Scanner;

public class ArraysHomeAssignment {
    Scanner sc = new Scanner(System.in);

    //task 1
    void replaceNegativeWithZero() {
        int[] nums = {-1, 2, -3, 4, 5, -6, 7, 8, -9, 10};
        System.out.print("Array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        int replacements = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
                replacements++;
            }
        }
        System.out.print("Modified: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("Replacements: " + replacements);
    }

    //task 2
    void secondLargest() {
        int[] nums = {1, 2, -3, 4, 5, -6, 7, 8, -9, 10};
        System.out.print("Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }

        int second = Integer.MIN_VALUE;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < largest && (!found || second < nums[i])) {
                second = nums[i];
                found = true;
            }
        }

        System.out.println("Largest: " + largest);
        if (!found) {
            System.out.println("No second largest distinct number.");
        } else {
            System.out.println("Second Largest: " + second);
        }
    }

    //task 3
    void deleteElementByIndex() {
        int[] nums = {-1, 2, -3, 4, 5, -6, 7, 8, -9, 10, 123, 435435, 31231};
        int size = nums.length;
        System.out.println("Original array");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\nindexes: ");
        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nChoose an index to delete: ");
        int indexToDelete = sc.nextInt();
        if (indexToDelete >= size || indexToDelete < 0) {
            System.out.println("Try again");
            return;
        }

        for (int i = indexToDelete; i < size - 1; i++) {
            nums[i] = nums[i + 1];
        }
        size--;
        System.out.print("\nUpdated: ");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    void detectDuplicates() {
        int[] nums = {12, 12, 1, 2, 3, 2, 5, 6, 7, 8};
        System.out.println("Array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(" " + nums[i]);
        }
        boolean hasDuplicates = false;

        for (int i = 0; i < nums.length; i++) {
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (nums[k] == nums[i]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.print(nums[i] + " ");
                    hasDuplicates = true;
                    break;
                }
            }


            if (!hasDuplicates) {
                System.out.println("No duplicates found.");
            }


        }

    }
}
