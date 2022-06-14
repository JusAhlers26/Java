import java.util.ArrayList;

public class CafeUtil {

    //getStreakGoal
    public int getStreakGoal() {
        int sum = 0;
        for(int drinks = 1; drinks <= 11; drinks++) {
            sum =+ drinks;
        }
        return sum;
    }
    //getOrderTotal
    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        for(double price: lineItems) {
            sum += price;
        }
        return sum;
    }
    // displayMenu
    public void displayMenu(ArrayList<String> menuItems) {
        for(int id = 0; id <menuItems.size(); id++) {
            System.out.printf("%s, %s \n", id, menuItems.get(id));
        }
    }
    // addCustomer. Had help on this one from solutions
    public void addCustomer(ArrayList<String> customerList) {
        System.out.println("What is your name?");
        String customer = System.console().readLine();
        System.out.printf("Hi, %s! ", customer);
        System.out.printf("There is %s people ahead of you.\n", customerList.size());
        customerList.add(customer);
        System.out.println(customerList);
    }
}