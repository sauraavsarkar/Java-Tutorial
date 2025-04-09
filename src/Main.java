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


        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String textOne = "ABCDEFGHIJKLMNOPQRS";
        String myName = "My name is Saurav Sarkar.";

        System.out.println("Total "+ items + " items are " + itemsNameOne + " "+ totalApple +" piece " + itemsNameTwo + " are "+ totalMango +" piece " + " cost of " + itemsNameOne + " is " + totalCostOfApple + currency + " and total cost of " + itemsNameTwo + " is "+ totalCostOfMango + currency );

        System.out.println(totalApple<totalMango && totalCostOfApple<totalCostOfMango);

        System.out.println(totalApple<items || totalMango<items);

        System.out.println(!(totalApple<items || totalMango>items));

        System.out.println(totalApple<=totalMango);

        System.out.println(totalApple>=totalMango);

        System.out.println(totalApple!=totalMango);

        System.out.println("Length of text is " + text.length());
        
        System.out.println("Length of text one is " + textOne.length());

        System.out.println(text.toLowerCase());

        System.out.println(textOne.toUpperCase());

        System.out.println(myName.indexOf("."));

    }
}