package labs.studyTimeTracker;

import java.util.Scanner;

public class StudyTimeTracker {


    Scanner sc = new Scanner(System.in);

    public void listenSTT() {
        while (true) {
            System.out.println("===== STUDY TRACKER =====\n" +
                    "\n" +
                    "1. Add study session\n" +
                    "2. View statistics\n" +
                    "3. Check weekly goal\n" +
                    "4. Exit\n" +
                    "\n" +
                    "Choose an option:\n");

            int command = sc.nextInt();
            sc.next();
            switch (command) {
                case 1:
                   break;




                        case 4:
                            System.exit(2);
                            sc.close();
                    }
            }
        }
    }
}


//    String menu =
//            "===== STUDY TRACKER =====\n" +
//                    "\n" +
//                    "1. Add study session\n" +
//                    "2. View statistics\n" +
//                    "3. Check weekly goal\n" +
//                    "4. Exit\n" +
//                    "\n" +
//                    "Choose an option:\n";
//
//    String chooseSubject = "Choose subject:\n" +
//            "1. Programming\n" +
//            "2. Mathematics\n" +
//            "3. English\n" +
//            "4. Other\n";