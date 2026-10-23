package labs.studyTimeTracker;

import java.util.Scanner;

public class StudyTimeTracker{
    Scanner sc = new Scanner(System.in);

    String menu =
      "===== STUDY TRACKER =====\n" +
                "\n" +
                "1. Add study session\n" +
                "2. View statistics\n" +
                "3. Check weekly goal\n" +
                "4. Exit\n" +
                "\n" +
                "Choose an option:\n";


    public void listenSTT (){
        while (true){
            System.out.println(menu);
            int command = sc.nextInt();
            sc.next();
            switch (command){
                case 1:


                    break;

            }
        }
    }
}
