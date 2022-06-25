public class Arrays {
    public static void main(String[] args) {
        String[] inventory = {"Knife", "Bread", "Helmet"};
        String Knife = inventory[0];
        inventory[1] = "fruit";

        String[] inventory2 = new String[3];
        System.out.println(Knife);
        System.out.println(inventory[2]);
        inventory2[0] = "Flabbergasted";
        inventory2[1] = "Confused";
        inventory2[2] = "Tired";
        System.out.println(inventory2[0]);
        System.out.println(inventory[1]);
        System.out.println(inventory[0]);
    }
    
}
