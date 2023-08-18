import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Welcome back from the expedition!");
        Thread.sleep(500);
        List<String> rocks = new ArrayList<>();
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");
        System.out.println("All rocks collected have been downloaded...");
        Thread.sleep(500);
        System.out.println(rocks);
        Thread.sleep(500);
        System.out.println("not rock detected...removing...");
        Thread.sleep(500);
        rocks.remove("not rock");
        System.out.println(rocks);
        Thread.sleep(500);
        System.out.println("Perfect");
        Thread.sleep(500);
        System.out.println("Loading Fossils...");
        Thread.sleep(1000);
        Map<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded...");
        Thread.sleep(600);
        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish, Tooth)\nSpelling and Capitalization Matters!");
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();
        if (fossilChoice.equalsIgnoreCase("Bird")){
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
        }
        Thread.sleep(500);
        System.out.println("Loading Special Supplies...");
        Thread.sleep(700);
        Set<String> specialSupplies = new HashSet<>();
        specialSupplies.add("Ray-Gun");
        specialSupplies.add("Med-kit");
        specialSupplies.add("Holy Hand Grenade");
        System.out.println("Supplies before expedition: ");
        for(String supply: specialSupplies){
            System.out.println(supply);
            Thread.sleep(500);
        }

        specialSupplies.remove("Ray-Gun");
        System.out.println("Supplies after expedition: ");
        for(String supply: specialSupplies){
            System.out.println(supply);
            Thread.sleep(500);
        }
    }
}