public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Mars City";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = landingCheck(5);
        meals = (meals - ((shipPopulation * .75)* 2));
        System.out.println("There are "+ meals + " meals left.");
        meals += (meals * .5);
        shipPopulation += 5;
        String landingLocation = "The Plain";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }
        landingCheck(5);
        new guessingGame();
        new MarsExpedition();
        new FindingsList();
    }


    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0;minute < minutesLeft; minute++){
            if ((minute % 2 == 0) && (minute % 3 == 0)){
                System.out.println("Keep Center");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            }else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
