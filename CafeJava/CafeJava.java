public class CafeJava {

    public static void main(String[] args) {
        
        String generalGreeting = "Welcome to cafe Java, ";
        String pendingMessage = ", your order will be ready shortly ";
        String readyMessage = ", your order is ready ";
        String displayTotalMessage = " Your total is $";
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.1;
        double lattePrice = 3.2;
        double cappucinoPrice = 4.1;
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + pendingMessage);

        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.printf(displayTotalMessage + cappucinoPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
        System.out.println(customer2 + displayTotalMessage + lattePrice *2);
        if(isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println(customer3 + displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}
