package labs;

import java.util.Scanner;

public class ScreenTimeTracker {
    private final Scanner scanner;
    private final int[] categoryMinutes = new int[4];
    private int totalScreenTime;
    private int recordedSessions;

    public ScreenTimeTracker(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            System.out.println("""
                    ===== SCREEN-TIME TRACKER =====
                    1. Add social media time
                    2. Add gaming time
                    3. Add studying time
                    4. Add video or streaming time
                    5. View statistics
                    6. Exit
                    """);

            Integer option = readInteger("Choose an option: ");
            if (option == null) {
                return;
            }

            switch (option) {
                case 1, 2, 3, 4 -> addScreenTime(option);
                case 5 -> viewStatistics();
                case 6 -> {
                    System.out.println("Screen-time tracker closed.");
                    return;
                }
                default -> System.out.println("Invalid option. Choose a value from 1 to 6.");
            }
        }
    }

    private void addScreenTime(int category) {
        String[] names = {"social media", "gaming", "studying", "video or streaming"};
        Integer minutes = readInteger("Enter " + names[category - 1] + " minutes: ");
        if (minutes == null) {
            return;
        }
        if (minutes <= 0) {
            System.out.println("Invalid time. Minutes must be greater than 0.");
            return;
        }

        categoryMinutes[category - 1] += minutes;
        totalScreenTime += minutes;
        recordedSessions++;
        System.out.println("Time added successfully!");
    }

    private void viewStatistics() {
        int studyingTime = categoryMinutes[2];
        int entertainmentTime = categoryMinutes[0] + categoryMinutes[1] + categoryMinutes[3];

        System.out.println("===== TODAY'S SCREEN TIME =====");
        System.out.println("Social media: " + categoryMinutes[0] + " minutes");
        System.out.println("Gaming: " + categoryMinutes[1] + " minutes");
        System.out.println("Studying: " + categoryMinutes[2] + " minutes");
        System.out.println("Streaming: " + categoryMinutes[3] + " minutes");
        System.out.println("Total screen time: " + totalScreenTime + " minutes");
        System.out.println("Recorded sessions: " + recordedSessions);

        if (studyingTime > entertainmentTime) {
            System.out.println("Study screen time is greater than entertainment screen time. Good balance!");
        } else if (entertainmentTime > studyingTime) {
            System.out.println("Entertainment screen time is greater than study time.");
        } else {
            System.out.println("Study and entertainment screen time are equal.");
        }

        if (totalScreenTime < 120) {
            System.out.println("Low screen time");
        } else if (totalScreenTime <= 240) {
            System.out.println("Moderate screen time");
        } else {
            System.out.println("High screen time");
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
