package arraysPractice;

import java.util.Scanner;

public class TwoDArrayClassTask {
    Scanner scanner = new Scanner(System.in);
//task1
    void printArr() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
//for me
    void matrixPrint(int[][] matrix) {
        System.out.println("Original matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

//task2
    void printingAndMod() {
        int[][] m = {
                {5, 10, 15},
                {20, 25, 30}};
        m[0][1] = 99;
        System.out.println(m[1][2]);
    }
    //task3
    void sumOfM() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of all: " + sum);
    }
    //task4
    void evenOddsInM() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int even = 0;
        int odds = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    even++;
                } else {
                    odds++;
                }
            }
        }

    }
    //task5
    void minAndMaxOfMatrix() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        matrixPrint(matrix);
        int max = matrix[0][0];
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Minimum is: " + min);
        System.out.println("Maximum is: " + max);
    }

    //task6
    void fillTwoDViaScanner() {
        int[][] gonnaFilledByUser = new int[2][3];
        for (int i = 0; i < gonnaFilledByUser.length; i++) {
            for (int j = 0; j < gonnaFilledByUser[i].length; j++) {
                System.out.println("Input value for " + i + " " + j);
                gonnaFilledByUser[i][j] = scanner.nextInt();
            }
        }
        matrixPrint(gonnaFilledByUser);
    }

    //task7
    void calculateSeparateRow() {
        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int i = 0; i < nums.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                rowSum += nums[i][j];
            }
            System.out.println("Sum of row " + i + " = " + rowSum);
        }

    }
    //task8
    void calculateSeparateColumn() {
        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };


        for (int j = 0; j < nums[0].length; j++) {
            int columnSum = 0;
            for (int i = 0; i < nums.length; i++) {
                columnSum += nums[i][j];
            }
            System.out.println("Sum of column " + j + " = " + columnSum);
        }

    }


    //task9
    void howManyGreatThanUserValue() {
        System.out.println("Enter num");
        int userInput = scanner.nextInt();
        int[][] nums = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}
        };
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] > userInput) {
                    counter++;
                }
            }
        }

        System.out.println("Nums greater than " + userInput + " is " + counter);
    }
    //task10
    void findFirstMatchingElement() {
        System.out.println("Enter num");
        int userInput = scanner.nextInt();
        int[][] nums = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}
        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == userInput) {
                    System.out.println("the value matching to " + userInput +
                            " is in row " + i + " " + j);
                    return;
                }

            }

        }
        System.out.println("Not found");
    }

    //task11
    void mainDiagonalSumAndValues() {
        int[][] nums = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}
        };
        int sumOfMainDiagonal = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Value of main diagonal: " + nums[i][i]);
            sumOfMainDiagonal += nums[i][i];
        }
        System.out.println("Sum of main diagonal: " + sumOfMainDiagonal);
    }

    //task12
    void replaceNegative() {
        int[][] nums = {
                {1, -2, 3},
                {5, 6, 7},
                {9, -110, 11}
        };
       matrixPrint(nums);
        System.out.println("New matrix");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] < 0) {
                    nums[i][j] = 0;
                }
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }

    //task13
    void studentGrades() {
        int[][] grades = {
                {100, 52, 73, 88},
                {99, 68, 67, 100},
                {92, 93, 66, 89}
        };
        int totalSum = 0;
        int totalCount = 0;
        int classMax = grades[0][0];

        for (int i = 0; i < grades.length; i++) {

            int studentSum = 0;

            for (int j = 0; j < grades[i].length; j++) {
                int currentScore = grades[i][j];

                studentSum += currentScore;
                totalSum += currentScore;
                totalCount++;

                if (currentScore > classMax) {
                    classMax = currentScore;
                }
            }

            double studentAvg = (double) studentSum / grades[i].length;
            System.out.println("Средний балл студента " + (i + 1) + ": " + studentAvg);
        }


        double overallAvg = (double) totalSum / totalCount;
        System.out.println("Максимальная оценка в классе: " + classMax);
        System.out.println("Общий средний балл класса: " + overallAvg);
    }


//optional challenges

    void largestRowSum() {
        int[][] nums = {
                {100, 52, 73, 88},
                {99, 68, 67, 100},
                {92, 93, 66, 89}
        };
        int maxRowSum = Integer.MIN_VALUE;
        int maxRowIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int sumRow = 0;

            for (int j = 0; j < nums[i].length; j++) {
                sumRow += nums[i][j];
            }
            if (sumRow > maxRowSum) {
                maxRowSum = sumRow;
                maxRowIndex = i;

            }
        }
        System.out.println("Largest row sum is: " + maxRowSum);
        System.out.println("Largest row index is: " + maxRowIndex);
    }


    void transpose() {
        int[][] nums = {
                {100, 52, 73},
                {99, 68, 67},

        };
        System.out.print("Original: ");
        matrixPrint(nums);

        int[][] brandNew = new int[3][2];
        System.out.print("Transposed:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                brandNew[i][j] = nums[j][i];
                System.out.print(brandNew[i][j] + " ");
            }
        }
    }


    void addTwoMatrices() {
        int[][] first = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] second = {
                {10, 20, 30},
                {40, 50, 60}
        };

        int[][] result = new int[2][3];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
