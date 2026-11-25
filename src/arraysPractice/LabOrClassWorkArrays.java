package arraysPractice;

import java.util.Scanner;


public class LabOrClassWorkArrays {
    Scanner scanner = new Scanner(System.in);

    //Task1
    void evenIndiciesOfArray() {
        int[] eightElementArray = {1, 2, 3, 4, 5, 6, 78, 8};
        for (int i = 2; i < eightElementArray.length; i++) {
            if (i % 2 == 0) {
                System.out.print(eightElementArray[i] + " ");
            }
        }
    }

    //Task2
    void sumOfPosiriveNums() {
        int[] nums = {3, -2, 0, 7, -4, 5};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                sum += nums[i];
                System.out.print(nums[i] + " + ");
            }
        }
        System.out.print(" = " + sum);
    }

    //Task3
    void howManyValues10to20() {
        int[] nums = new int[8];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("input values");
            nums[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 10 && nums[i] <= 20) {
                counter++;
            }
        }

        System.out.print("Count: " + counter);
    }



    //Task4
    void minIndexAndVal() {
        int[] nums = {67, 76, 52, 25, 73, 37, 10};
        int min = nums[0];
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];

                index = i;
            }
        }
        System.out.print("Min: " + min + " |");
        System.out.println(" Index: " + index);
    }


    //Task5
    void addingFiveToEach() {
        int[] nums = {67, 76, 52, 25, 73, 37, 10};
        System.out.print("Original: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] += 5;
        }
        System.out.print("\nModified: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }



    //Task6
    void howManyGreatThan() {
        int[] nums = {67, 76, 52, 25, 73, 37, 1010};

        int comparable = nums[0];
        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (comparable > nums[i]) {
                counter++;
            }
        }
        System.out.println("Counter: "+counter);
    }


    //Task7
    void copyOfEven(){
        int []nums={3,8,5,2,7,4,9,6};

        int sizeOfEvenArr =0;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i]%2==0){
                sizeOfEvenArr++;
            }
        }
        int [] evenArray=new int[sizeOfEvenArr];
        for (int i = 0; i < sizeOfEvenArr; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ( nums[i]%2==0){evenArray[i]=nums[j];}
            }
        }
    }
//Task8
    void howManyAboveAVG(){
        int []nums= {18,20,22,19,21,24,16};
        double avg=0;
        for (int i = 0; i < nums.length ; i++) {
            avg+=nums[i];
        }
        avg/= nums.length;
        System.out.println("Average temperature: "+avg);
        int aboveAVG=0;
        for ( int num:nums){
            if ( num>avg){
                aboveAVG++;
            }
        }
        System.out.println("Above average temperature: "+aboveAVG);

    }

    //Task 9
    void printArr() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}

        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    //task 10
    void howManyZeros(){
        int[][] nums = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] ==0) {
                    counter++;
                }
            }
        }
        System.out.println("Zeros: "+counter);
    }
}

