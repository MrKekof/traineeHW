import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CommandController {
    Scanner sc = new Scanner(System.in);

    public void hiStudent() {
        String urc = "U r cooked";
        String mjr = "COMSE";
        System.out.println("Hello , please enter your name: ");
        String name = sc.nextLine();
        if (name.trim().isEmpty() || name.length() < 3) {
            System.out.println("Name cannot be empty or less than 3 chars");
            return;
        }
        System.out.println(" Hello , please enter your surname: ");
        String surname = sc.nextLine();
        if (surname.trim().isEmpty() || surname.length() < 3) {
            System.out.println("Surname cannot be empty or less than 3 chars");
            return;
        }
        System.out.println("Enter ur major: ");
        String major = sc.nextLine();
        if (major.trim().isEmpty() || major.length() < 3) {
            System.out.println("Major cannot be empty or less than 3 chars");
            return;
        }
        if (major.equalsIgnoreCase(mjr)) {
            System.out.println(urc);
        }
        System.out.println("Welcome in " + name + " " + surname + " nice to meet u "
                + major + " is a great choice good luck!");
    }


    public void squareEquationSolver() {
        System.out.println("Solver for this equation -> 'y = 5x² + 2x + 11' +\n Enter value of X: ");
        int x = sc.nextInt();
        System.out.println(x * x * 5 + 2 * x + 11);
    }

    public void help() {
        System.out.println("========================================================");

        for (CommandEnum commandEnum : CommandEnum.values()) {
            System.out.printf("%-15s %s%n",
                    commandEnum.getCommandName(),
                    commandEnum.getDescription()
            );
        }

        System.out.println("========================================================");
    }

    public void primitiveCalculator() {
        System.out.print("\nInput first num: ");
        double num1 = sc.nextDouble();
        System.out.print("\nInput second num: ");
        double num2 = sc.nextDouble();
        System.out.print("\nChoose an operation between: + - * /");
        String operation = sc.next();
        if (!operation.equals("+") && !operation.equals("-")
                && !operation.equals("*") && !operation.equals("/"))
        {
            System.out.println("Choose operation between: + - * / ");
            return;
        }

        switch (operation) {
            case "+":
                double resultPLus = num1 +num2;
                System.out.println(num1 + " + " + num2 + " = " + resultPLus);
                break;

            case "-":
                double resultMinus = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultMinus);
                break;

            case "/":
                if (num2 == 0){
                    System.out.println("Second num can't be 0");
                    return;
                }
            double resultDivide= num1/num2;
                System.out.println(num1 + " / " + num2 + " = " + resultDivide);
                break;


            case "*":
                double resultMulti = num1*num2;
                System.out.println(num1 + " * " + num2 + " = " + resultMulti);
                break;

        }
    }

    void maxOfThree() {
        System.out.print("\nInput first num");
        int a = sc.nextInt();
        System.out.print("\nInput second num");
        int b = sc.nextInt();
        System.out.print("\nInput third num");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("The biggest value is first num: " + a);

        } else if (b > a && b > c) {
            System.out.println("The biggest value is second num: " + b);

        } else System.out.println("The biggest value is third number: " + c);

    }



    void canYouVote (){
        System.out.print("\nEnter ur age: ");
        String strAge = sc.nextLine();
        int age = 0;
        try {
             age = Integer.parseInt(strAge);
        }catch (NumberFormatException e){
            System.out.println("write num only ");
        }
        if (age<18){
            System.out.println("you can't vote");
        }
        if ( age >100 ){
            System.out.println(" Are you still alive?");
        }
        else {
            System.out.println("congrats , u can vote and earn 1000 soms");
        }
    }



    void simpleStore(){
        boolean running = true;
        int mousePrice = 20;
        int keyBoardPrice = 40;
        int headphonesPrice = 50 ;
        int laptopStandPrice = 30;
        System.out.println("Welcome to simpleStore");

        int userInput = sc.nextInt();
        sc.next();
        while(true){
            System.out.println("==== SIMPLE STORE ====");
            System.out.println("1. Mouse - $20");
            System.out.println("2. Keyboard - $40");
            System.out.println("3. Headphones - $50");
            System.out.println("4. Laptop Stand - $30");
            System.out.println("5. Checkout");
            System.out.print("\nChoose a product: ");
            switch(userInput){

                case 1:


                default:
                    System.out.println("Choose between given options");
                    break;



            }
        }


    }
}
