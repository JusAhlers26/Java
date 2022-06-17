public class arrays {
    public static void main(String[] args){
        String[] inventory = {"Knife","Bread","Helmet","","",""};
        String knife = inventory[1];
        inventory[1] = "Fruit";
        System.out.println(inventory[0]);
        System.out.println(inventory[1]);
        System.out.println(inventory[2]);
        System.out.println(knife);
        // This does the same as above but adds how ever may to array empty. you then have to assign them.
        String[] inventory2 = new String[3];
        inventory2[0] = "Bike";
        inventory2[1] = "Tools";
        inventory2[2] = "Brains";
        System.out.println(inventory2[0]);
        System.out.println(inventory2[1]);
        System.out.println(inventory2[2]);

        double[] prices = new double[10];
        prices[0] = 0.25;
        prices[1] = 1.25;
        prices[2] = 2.25;
        prices[3] = 3.25;
        prices[4] = 4.25;
        prices[5] = 5.25;
        prices[6] = 6.25;
        prices[7] = 7.25;
        prices[8] = 8.25;
        prices[9] = 9.25;
        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);
        System.out.println(prices[5]);
        System.out.println(prices[6]);
        System.out.println(prices[7]);
        System.out.println(prices[8]);
        System.out.println(prices[9]);
    }
}
