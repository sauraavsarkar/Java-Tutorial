public class Main {
    public static void main(String[] args) {
        int items = 5;
        float costOfItems = 100.00f;
        String itemsNameOne = "Apple";
        String itemsNameTwo = "Mango";
        int totalApple = 3;
        float appleCost = 25.00f;
        char currency = '৳';

        float totalCostOfApple = totalApple * appleCost;
        int totalMango = items - totalApple;
        float totalCostOfMango = costOfItems - totalCostOfApple ;

        System.out.print("Total "+ items + " items are " + itemsNameOne + " "+ totalApple +" piece " + itemsNameTwo + " are "+ totalMango +" piece " + " cost of " + itemsNameOne + " is " + totalCostOfApple + currency + " and total cost of " + itemsNameTwo + " is "+ totalCostOfMango + currency );


    }
}