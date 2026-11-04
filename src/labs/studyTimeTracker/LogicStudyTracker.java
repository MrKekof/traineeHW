package labs.studyTimeTracker;

import java.util.Scanner;

public class LogicStudyTracker {
    Scanner sc = new Scanner(System.in);

    public void executeAddStudySession() {
        while (true) {
            System.out.print(
                    "1. Programming\n" +
                            "2. Mathematics\n" +
                            "3. English\n" +
                            "4. Other\n" +
                            "5. Exit\n" +
                            "Choose an option: ");
            int subjectChoice = sc.nextInt();
            sc.next();
            switch (subjectChoice){
                case 1:

            }
        }


    }
}
