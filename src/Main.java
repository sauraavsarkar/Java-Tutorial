public class Main {
    public static void main(String[] args) {



        System.out.println("Widening Casting or automatically Casting" );


        int mySalary = 500;
        double myCost = 450.50d;

        double myTotalSalary = mySalary;

        //this is one way of automatically type casting
        double mySaving =  myTotalSalary - myCost;
        System.out.println(myTotalSalary);//500.0
        System.out.println(mySaving);//49.5

        //this another way of automatically type casting
        double mySavingNew = (double) mySalary-myCost;
        System.out.println((double) mySalary);//500.0
        System.out.println(mySavingNew);//49.5
        System.out.println((double) mySalary - myCost);//49.5




        //Narrowing Casting or manually Casting
        System.out.println("Narrowing Casting or manually Casting" );

        double myNewSalary = 555.00d;
        double myNewCost = 55.00d;

        int myIntNewSalary = (int) myNewSalary;
        int myIntNewCost = (int) myNewCost;


        double myNewSaving = myNewSalary - myNewCost;
        int myIntNewSaving = myIntNewSalary - myIntNewCost;


        System.out.println(myNewSaving);
        System.out.println(myIntNewSalary-myIntNewCost);
        System.out.println(myIntNewSaving);











































        int items = 5;
        float costOfItems = 100.00f;
        String itemsNameOne = "Apple";
        String itemsNameTwo = "Mango";
        int totalApple = 3;
        float appleCost = 25.00f;
        char currency = '৳';
        String A = "1";
        String B = "1";
        String C = "1";
        String D = A + B + C ;
        int E = 1;

        int numberOfA = Integer.parseInt(A);
        int numberOfB = Integer.parseInt(B);
        int numberOfC = Integer.parseInt(C);
        int numberOfD = Integer.parseInt(D);

        System.out.println(numberOfA+numberOfB+numberOfC);

        System.out.println(numberOfD+E+E);


        System.out.println(numberOfD);



        System.out.println(A+B+C+D);

        System.out.println(D);



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

        System.out.println(itemsNameOne + " " + itemsNameTwo);

        System.out.println("Items name "+ itemsNameOne .concat(itemsNameTwo) );



    }
}