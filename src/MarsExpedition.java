import java.util.Scanner;
public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Booting Mars Expedition...");
        Thread.sleep(600);
        System.out.println("Loading...");
        Thread.sleep(600);
        System.out.println("...");
        Thread.sleep(600);
        System.out.println("Ready!");
        Thread.sleep(600);
        System.out.println("What is your name Traveler?");
        String name = input.nextLine();
        System.out.println("Hello " + name + "-- Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String option = input.nextLine();
        if (option.equalsIgnoreCase("Y")){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else if (option.equalsIgnoreCase("N")){
            System.out.println("Too bad you are team leader. You have to go.");
        } else {
            System.out.println("Incorrect option, but you are going anyway!");
        }
        Thread.sleep(600);
        System.out.println("How many people do you need to join your expedition?");
        int teamSize = input.nextInt();
        if (teamSize > 2){
            System.out.println("Too large of a team, 2 people should be sufficient!");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("Too small of a team, 2 people should be sufficient!");
            teamSize = 2;
        } else if (teamSize == 2){
            System.out.println("Good choice, 2 people should be sufficient!");
        }
        Thread.sleep(600);
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        input.nextLine();
        String snack = input.nextLine();
        Thread.sleep(600);
        System.out.println("Nice choice, you will be bringing " + snack + " with you.");
        Thread.sleep(600);
        System.out.println("You have the choice of 3 vehicles..." +
                "\nA: A Prius" +
                "\nB: A Toyota Supra" +
                "\nC: A Minivan");
        String vehicleChoice = input.nextLine();
        if (vehicleChoice.equalsIgnoreCase("A")){
            vehicleChoice = "A Prius";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "A Toyota Supra";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "A Minivan";
        } else {
            vehicleChoice = "Your Feet";
        }
        Thread.sleep(1000);
        System.out.println("Your expedition is ready ..." +
                "\nWelcome " + name + " to the Mars expedition! ..." +
                "\nYou are bringing " + teamSize + " people on your journey" +
                "\nWith a snack of " + snack +
                "\nAnd the vehicle of " + vehicleChoice +
                "\nGood luck, and godspeed! You are beginning in..." +
                "\n5" +
                "\n4" +
                "\n3" +
                "\n2" +
                "\n1" +
                "\nGo time!");
    }
}