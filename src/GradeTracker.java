import java.util.Scanner;

public class GradeTracker {
    private final Scanner scanner;
    private double assignmentPoints;
    private double examPoints;
    private int assignmentCount;
    private int examCount;

    public GradeTracker(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            System.out.println("""
                    ===== SEMESTER GRADE TRACKER =====
                    1. Add assignment result
                    2. Add exam result
                    3. View current grade
                    4. Exit
                    """);

            Integer option = readInteger("Choose an option: ");
            if (option == null) {
                return;
            }

            switch (option) {
                case 1 -> addAssignmentResult();
                case 2 -> addExamResult();
                case 3 -> viewCurrentGrade();
                case 4 -> {
                    System.out.println("Grade tracker closed.");
                    return;
                }
                default -> System.out.println("Invalid option. Choose a value from 1 to 4.");
            }
        }
    }

    private void addAssignmentResult() {
        Integer score = readInteger("Enter assignment score: ");
        if (score == null) {
            return;
        }
        if (!isValidScore(score)) {
            System.out.println("Invalid score. Enter a value from 0 to 100.");
            return;
        }

        assignmentPoints += score;
        assignmentCount++;
        System.out.println("Assignment score added.");
    }

    private void addExamResult() {
        Integer score = readInteger("Enter exam score: ");
        if (score == null) {
            return;
        }
        if (!isValidScore(score)) {
            System.out.println("Invalid score. Enter a value from 0 to 100.");
            return;
        }

        examPoints += score;
        examCount++;
        System.out.println("Exam score added.");
    }

    private void viewCurrentGrade() {
        if (assignmentCount == 0 && examCount == 0) {
            System.out.println("No results available yet.");
            return;
        }

        Double assignmentAverage = assignmentCount == 0 ? null : assignmentPoints / assignmentCount;
        Double examAverage = examCount == 0 ? null : examPoints / examCount;
        double overallAverage;

        if (assignmentAverage == null) {
            overallAverage = examAverage;
        } else if (examAverage == null) {
            overallAverage = assignmentAverage;
        } else {
            overallAverage = assignmentAverage * 0.50 + examAverage * 0.50;
        }

        System.out.println("===== CURRENT RESULTS =====");
        System.out.println("Assignments completed: " + assignmentCount);
        if (assignmentAverage == null) {
            System.out.println("Assignment average: no results");
        } else {
            System.out.printf("Assignment average: %.1f%n", assignmentAverage);
        }
        System.out.println("Exams completed: " + examCount);
        if (examAverage == null) {
            System.out.println("Exam average: no results");
        } else {
            System.out.printf("Exam average: %.1f%n", examAverage);
        }
        if (assignmentAverage == null || examAverage == null) {
            System.out.println("Only one category has results; its average is used as the current overall average.");
        }
        System.out.printf("Overall average: %.1f%n", overallAverage);
        System.out.println("Grade: " + gradeFor(overallAverage));
        System.out.println("Status: " + (overallAverage >= 60 ? "Passing" : "Failing"));
    }

    private boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    private String gradeFor(double average) {
        if (average >= 90) {
            return "A";
        }
        if (average >= 80) {
            return "B";
        }
        if (average >= 70) {
            return "C";
        }
        if (average >= 60) {
            return "D";
        }
        return "F";
    }

    private Integer readInteger(String prompt) {
        System.out.print(prompt);
        if (!scanner.hasNextLine()) {
            return null;
        }

        String input = scanner.nextLine().trim();
        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException exception) {
            System.out.println("Invalid input. Enter a whole number.");
            return null;
        }
    }
}
