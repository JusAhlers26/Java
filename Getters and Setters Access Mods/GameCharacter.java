public class GameCharacter {
    
    String name;
    int pos;
    int health;
    
    GameCharacter(String name, int pos, int health) {
        this.name = name;
        this.pos = pos;
        this.health = health;

    }

    void move(int amount) {
        this.pos += amount;
    }
    
}

class Start {
    public static void main(String[] args) {
        GameCharacter gc = new GameCharacter("N1mR0D", 0, 100);
        gc.health = 200;
        gc.move(10);
        System.out.println(gc.health);
        System.out.println(gc.pos);
        System.out.println(gc.name);
    }
}