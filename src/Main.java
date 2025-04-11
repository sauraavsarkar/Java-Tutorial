public class Main {
    public static void main(String[] args) {


        //Strings - Special Characters

        String textIs1 = "My name is \"Saurav Sarkar\"";

        String textIs2 = "It\'s Okay";

        String textIs3 = "The character \\ is called backslash.";

        String textIs4 = "Hi my is saurav sarkar \n i am live in \r dhaka . Dhaka is the capital and \t largest city of Bangladesh. It is located in the \b geographic center of the country in the great deltaic region \f of the Ganges and Brahmaputra rivers. ";


        System.out.println(textIs1);

        System.out.println("\n");


        System.out.println(textIs2);

        System.out.println(textIs3);

        System.out.println(textIs4);





//        System.out.println("\r");
//        System.out.println("\t");
//        System.out.println("\b");
//        System.out.println("\f");




        System.out.println(" ");

        System.out.println(" ");

        System.out.println(" ");

        System.out.println(" ");

        //Adding Numbers and Strings
        int myAge = 25;
        int friendAge = 26;

        String myNameIs = "Saurav";
        String friendName = "Sarkar";

        String myRealAge = "25";
        String friendRealAge = "26";

        System.out.println( myAge + friendAge);

        System.out.println(myNameIs+friendName);

        System.out.println(myRealAge+friendRealAge);

        //String Concatenation

        String firstName = "Saurav";
        String lastName = "Sarkar";

        System.out.println(firstName+" "+lastName);

        System.out.println(firstName.concat(lastName));

        //Java Type Casting

        int kamlaTake = 310;

        int RahimTake = 200;

        float averageRun = (float)kamlaTake+RahimTake / 2f ;

        System.out.println("Average run :" + averageRun);

        System.out.println( kamlaTake < RahimTake );

        System.out.println( RahimTake< averageRun);


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