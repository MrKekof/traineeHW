package arraysPractice;

import java.util.Scanner;

public class ArraysPractice {
    Scanner scanner = new Scanner(System.in);
    //task 1
    void countPlusMinus(){
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int positive=0;
        int negative=0;
        int zero =0;

        for ( int i =0 ; i<nums.length ; i++){
            if (nums[i]>0 ){
                positive++;
            }
            else if (nums[i]<0){
                negative++;

            }
            else{
                zero++;
            }
        }
        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+negative);
        System.out.println("zeros: "+zero);
    }

 //task 2
    void smallestAndBiggestVal(){
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int largest = nums[0];
        int smallest = nums[0];
        int indexBig = 0;
        int indexSmall = 0;
        System.out.print("Array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                indexBig = i;
            }
            if (nums[i] < smallest) {
                smallest = nums[i];
                indexSmall = i;
            }
        }
        System.out.println("\nLargest: " + largest + " at index " + indexBig);
        System.out.println("Smallest: " + smallest + " at index " + indexSmall);
    }


    //task 3
    void greaterThanAvg(){
        int [] nums = {1,2,3,4,5,6};
        System.out.print("Array: ");
        for (int n:nums){
            System.out.print(" "+nums[n]);
        }

        double sum=0;
        for (int i=0 ; i< nums.length ; i++){
            sum +=nums[i];
        }
        double avg=sum/ nums.length;
        System.out.println("Average: "+avg);
        int aboveAvg=0;
        for (int i=0 ; i< nums.length ; i++){
            if (nums[i]>avg ){
                aboveAvg++;
            }
        }
        System.out.println("Above average: "+aboveAvg);
    }


    //Task 4
    public void revInPlace() {
        int[] nums ={1,2,3,4,5,6,7};
        int left = 0;
        int right = nums.length - 1;

        System.out.print("Original: ");
        for (int n:nums){
            System.out.print(" "+nums[n]);
        }
        while (left < right) {
            int swap = nums[left];
            nums[left] = nums[right];
            nums[right] = swap;


            left++;
            right--;

        }
        System.out.println("Reversed arr: ");
        for (int n:nums){
            System.out.print(" "+nums[n]);
        }
    }

//task5
    void studentTestScorer(){
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        int passed = 0;
        int failed = 0;
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            while (true) {
                System.out.print("Enter score " + (i + 1) + " (0-100): ");
                int input = scanner.nextInt();
                if (input >= 0 && input <= 100) {
                    scores[i] = input;
                    break;
                } else {
                    System.out.println("Invalid score! Please enter a value between 0 and 100.");
                }
            }
        }
        System.out.print("Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            sum += scores[i];
            if (scores[i] >= 60) {
                passed++;
            } else {
                failed++;
            }
        }
        System.out.println();
        double average = (double) sum / scores.length;
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average);
    }


}
