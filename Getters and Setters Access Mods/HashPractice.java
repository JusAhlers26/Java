import java.util.HashMap;

public class HashPractice {

    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Knife", 2);
        inventory.put("Boots", 3);
        inventory.put("Axes", 1);

        int numKnives = inventory.get("Knife");
        // finds the key Axes and changes the value 
        //  if cannot find Axes creates one.
        inventory.put("Axes", 2);
        // finds Axes and replaces value.
        inventory.replace("Axes", 2);
        System.out.println(numKnives);
        System.out.println(inventory);
        
    }
    
}
