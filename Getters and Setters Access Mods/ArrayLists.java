import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("Knife");
        inventory.add("Boots");
        inventory.add("Bread");

        String twoString = inventory.get(0);
        inventory.set(1, "Gloves");

        inventory.remove(0);
        inventory.remove("Bread");

        System.out.println(inventory);
        System.out.println(twoString);
    }
}
