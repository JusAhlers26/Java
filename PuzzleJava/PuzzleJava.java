import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer>  getTenRolls() {
        
        ArrayList<Integer> randTen = new ArrayList<Integer>();
        Random getTen = new Random();
        for(int i = 0; i < 10; i++) {
            int answer = getTen.nextInt(20) + 1;
            System.out.println(answer);
        }
        return randTen;
    }

    public String getRandomLetter() {

        Random randLetter = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char randomChar = alphabet.charAt(randLetter.nextInt(26));

        return String.valueOf(randomChar);
    }

    public String generatePassword() {
        String password = " ";
        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int len) {
        ArrayList<String> newPassword = new ArrayList<String>();
        for(int i = 0; i < len; i++) {
            newPassword.add(generatePassword());
        }
        return newPassword;
    }
}
