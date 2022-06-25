public class ForLoops {
    public static void main(String[] args) {
        // for (start; end; iterator)
        String[] inventory = {"One", "Two", "Three"};
        for (int i = 0; i < 3; i += 1) {
            String item = inventory[i];
            System.out.println(item);
        }
    }
    
}
