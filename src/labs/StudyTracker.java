package labs;

import java.util.Scanner;

public class StudyTracker {
    private static final int WEEKLY_GOAL = 600;

    private final Scanner scanner;
    private final int[] subjectMinutes = new int[4];
    private int totalStudyTime;
    private int studySessions;

    public StudyTracker(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            System.out.println("""
                    ===== STUDY TRACKER =====
                    1. Add study session
                    2. View statistics
                    3. Check weekly goal
                    4. Exit
                    """);

            Integer option = readInteger("Choose an option: ");
            if (option == null) {
                return;
            }

            switch (option) {
                case 1 -> addStudySession();
                case 2 -> viewStatistics();
                case 3 -> checkWeeklyGoal();
                case 4 -> {
                    System.out.println("Study tracker closed. Keep up the good work!");
                    return;
                }
                default -> System.out.println("Invalid option. Choose a value from 1 to 4.");
            }
        }
    }

    private void addStudySession() {
        System.out.println("""
                Choose subject:
                1. Programming
                2. Mathematics
                3. English
                4. Other
                """);

        Integer subject = readInteger("Choose an option: ");
        if (subject == null) {
            return;
        }
        if (subject < 1 || subject > 4) {
            System.out.println("Invalid subject. Choose a value from 1 to 4.");
            return;
        }

        Integer minutes = readInteger("Study time in minutes: ");
        if (minutes == null) {
            return;
        }
        if (minutes <= 0) {
            System.out.println("Invalid study time. Time must be greater than 0.");
            return;
        }

        subjectMinutes[subject - 1] += minutes;
        totalStudyTime += minutes;
        studySessions++;
        System.out.println("Study session added!");
        System.out.println("Current total study time: " + totalStudyTime + " minutes");
    }

    private void viewStatistics() {
        System.out.println("===== WEEKLY STATISTICS =====");
        System.out.println("Study sessions: " + studySessions);
        System.out.println("Total study time: " + totalStudyTime + " minutes");
        System.out.println("Programming: " + subjectMinutes[0] + " minutes");
        System.out.println("Mathematics: " + subjectMinutes[1] + " minutes");
        System.out.println("English: " + subjectMinutes[2] + " minutes");
        System.out.println("Other: " + subjectMinutes[3] + " minutes");
    }

    private void checkWeeklyGoal() {
        int remaining = Math.max(0, WEEKLY_GOAL - totalStudyTime);
        System.out.println("Weekly goal: " + WEEKLY_GOAL + " minutes");
        System.out.println("You studied: " + totalStudyTime + " minutes");
        if (totalStudyTime >= WEEKLY_GOAL) {
            System.out.println("Weekly goal achieved!");
        } else {
            System.out.println("Remaining: " + remaining + " minutes");
        }
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
