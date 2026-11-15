import labs.GradeTracker;
import labs.ScreenTimeTracker;
import labs.StudyTracker;

import java.util.Scanner;

public class CommandLineListener {
    private final Scanner scanner = new Scanner(System.in);
    private final CommandController commandController = new CommandController(scanner);
    private final StudyTracker studyTracker = new StudyTracker(scanner);
    private final GradeTracker gradeTracker = new GradeTracker(scanner);
    private final ScreenTimeTracker screenTimeTracker = new ScreenTimeTracker(scanner);


    public void listen() {

        while (true) {
            System.out.print("\nInput command: ");
            if (!scanner.hasNextLine()) {
                return;
            }
            String cmd = scanner.nextLine();
            try {
                CommandEnum commandEnum = CommandEnum.valueOf(cmd.toUpperCase());
                switch (commandEnum) {
                    case HISTUDENT:
                        commandController.hiStudent();
                        break;

                    case EXIT:
                        scanner.close();
                        return;

                    case SOLVE:
                        commandController.squareEquationSolver();
                        break;

                    case MAXOF3:
                        commandController.maxOfThree();
                        break;

                    case HELP:
                        commandController.help();
                        break;

                    case CALCULATOR:
                        commandController.primitiveCalculator();
                        break;

                    case CANYOUVOTE:
                        commandController.canYouVote();
                        break;

                    case STUDYPLANNER:
                        studyTracker.run();
                        break;

                    case GRADETRACKER:
                        gradeTracker.run();
                        break;

                    case SCREENTIMETRACKER:
                        screenTimeTracker.run();
                        break;
                }


            } catch (IllegalArgumentException exception) {
                System.out.println("Unknown command , please use help  ");
            }
        }
    }
}
