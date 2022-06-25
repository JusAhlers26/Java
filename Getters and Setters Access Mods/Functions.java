public class Functions {
    // function
    static int move(int pos, int amount) {
        int finalPos = pos + amount;
        return finalPos;
    }
    // calling the function
    public static void main(String[] args) {
        int finalPos = move(2, 10);
        System.out.println(finalPos);
    }
    
}
