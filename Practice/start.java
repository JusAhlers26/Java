class Start  {
    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println(hello);
    }
}
class Start1 {
    public static void main(String[] args) {
        int pos = 5;
        // pos = 5;
        double accountBalance = 100.25;
        boolean isGameOver = false;
        isGameOver = true;
        String name = "Nimrod";

        
        final int maxHealth = 100;
        // not allowed to be changed
        System.out.println(pos);
        System.out.println(accountBalance);
        System.out.println(isGameOver);
        System.out.println(name);
        System.out.println(maxHealth);
        System.out.println();
    }
}
class Start2 {
    public static void main(String[] args) {
        // Assignment: = assigns a value to operator
        int health = 100;
        String firstName = "Nimrod";
        // Arithmetic: +-*/%
        int newHealth = health + 20;
        health = health + 20;
        health += 20;
        String fullName = firstName + " Nesmith";
        // Comparison: == != >= > <= <
        double accountBalance = 100.25;
        double cost = 50.0;
        boolean canAfford = accountBalance >= cost;
        System.out.println(firstName.equals("Nimrod"));
        double minTotal = accountBalance - cost;
        double timesTotal = accountBalance * cost;
        double divideTotal = accountBalance / cost;
        double percentTotal = accountBalance % cost;
        System.out.println(minTotal);
        System.out.println(timesTotal);
        System.out.println(divideTotal);
        System.out.println(percentTotal);

        // Logical: && || !
        int numLives = 3;
        boolean isAlive = numLives > 0 && health >0;
        boolean isDead = !isAlive;
    }
}
