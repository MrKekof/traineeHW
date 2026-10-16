public enum CommandEnum {
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
