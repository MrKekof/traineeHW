package labs.studyTimeTracker;

public class StudyTTServiceImpl implements StudyTTService {
    @Override
    public void addStudySession() {

    }

    @Override
    public void menuOutput() {
        System.out.println("===== STUDY TRACKER =====\n" +
                "\n" +
                "1. Add study session\n" +
                "2. View statistics\n" +
                "3. Check weekly goal\n" +
                "4. Exit\n" +
                "\n" +
                "Choose an option:\n");
    }
}
