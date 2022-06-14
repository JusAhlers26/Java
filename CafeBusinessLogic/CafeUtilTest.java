import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CafeUtilTest {
    public static void main(String[] args) {

        CafeUtil cafeApp = new CafeUtil();

        // getStreakGoal
        System.out.println("----< Goals >----");
        System.out.printf("Sales needed before week 10: %s \n\n", cafeApp.getStreakGoal());

        // getOrderTotal
        System.out.println("-----< Totals >----");
        double[] prices = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",cafeApp.getOrderTotal(prices));
        
        //displayMenu
        System.out.println("----< Menu >----");
        
        List<String> displayMenu = Arrays.asList("drip coffee", "cappucino", "latte", "mocha");
        ArrayList<String> menu = new ArrayList<String>();
        menu.addAll(displayMenu);
        cafeApp.displayMenu(menu);
        
        //addCustomer
        System.out.println("\n----< New Customer >----");
        ArrayList<String> customer = new ArrayList<String>();

        // learned to set the number high or it stops the app function
        for (int i = 0; i < 99; i++) {
            cafeApp.addCustomer(customer);
            System.out.println("");
        }
    }
}