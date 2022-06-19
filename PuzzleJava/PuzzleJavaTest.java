import java.util.ArrayList;
import java.util.Random;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava initiate = new PuzzleJava();
        ArrayList<Integer> rando = initiate.getTenRolls();
        System.out.println(rando);
        System.out.println(initiate.getRandomLetter());
        System.out.println(initiate.generatePassword());
        System.out.println(initiate.getNewPasswordSet(8));

    }
}