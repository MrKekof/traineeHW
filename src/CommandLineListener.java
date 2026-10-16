import java.util.Scanner;

public class CommandLineListener {
    Scanner scanner = new Scanner(System.in);
    CommandController commandController = new CommandController();

    public void listen() {

        while (true) {
            System.out.print("\nInput command: ");
            String cmd = scanner.nextLine();
            try {
                CommandEnum commandEnum = CommandEnum.valueOf(cmd.toUpperCase());
                switch (commandEnum) {
                    case HISTUDENT:
                        commandController.hiStudent();
                        break;

                    case EXIT:
                        System.exit(1);
                        scanner.close();
                        break;

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
                }


            } catch (IllegalArgumentException exception) {
                System.out.println("Unknown command , please use help  ");
            }
        }
    }
}
