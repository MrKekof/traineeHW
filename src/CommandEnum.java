public enum CommandEnum {

    STUDYTIMETRACKER("Study Time tracker", "Track ur study time"),
    HISTUDENT("HiStudent", "This command greets student "),
    EXIT("Exit", "Stops program"),
    SOLVE("SolveEq", "Solving equations"),
    MAXOF3("MaxOf3", "finds max num of three"),
    CALCULATOR("calc", "Simple calculator"),
    CANYOUVOTE("Can you vote?", "this awesome program tells if u can vote"),
    HELP("Help", "Helps");


    private String commandName;
    private String description;

    CommandEnum(String commandName, String description) {
        this.commandName = commandName;
        this.description = description;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}








//STUDYPLANNER("Study Planner",
//            "Console application that" +
//                    " helps a student record study sessions and monitor progress" +
//                    " toward a weekly study goal."),
//    SCREENTIMETRACKER("Screen-time Tracker",
//            "a console application that records daily screen time by category and compares" +
//                    " productive screen time with entertainment screen time. " +
//                    "The menu must repeat until the student exits."),
