import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Java Booleans
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        //Java Math
        int javaMath = 5;
        int javaMath1 = 10;

        System.out.println(Math.max(5,10)); //maximum of two numbers
        System.out.println(Math.min(5,10));//minimum of two numbers
        System.out.println(Math.sqrt(81));//Square root
        System.out.println(Math.abs(-81.125)); //Absolute value
        System.out.println(Math.sqrt(81));//Square root
        System.out.println(Math.cbrt(64));//Cube root
        System.out.println(Math.round(4.5));//Rounds to nearest integer
        System.out.println(Math.ceil(4.5));//Rounds up to nearest integer
        System.out.println(Math.floor(4.8));//Rounds down to nearest integer
        System.out.println(Math.random());//Returns a random
        System.out.println(Math.log(5));//Natural logarithm
        System.out.println(Math.log10(100));//Logarithm base 10
        System.out.println(Math.exp(1));//Returns Euler’s number
        System.out.println(Math.toRadians(180));//Converts degrees to radians
        System.out.println(Math.toDegrees(3.141595));//Converts degrees to radians


        System.out.println(" ");

        System.out.println(Math.pow(2,2)); //power of


        int randomNum = (int)(Math.random()*101);
        System.out.println(Math.random());

        System.out.println(randomNum);

        System.out.println(Math.max(javaMath,javaMath1));

        //Strings - Special Characters

        String textIs1 = "My name is \"Saurav Sarkar\"";

        String textIs2 = "It\'s Okay";

        String textIs3 = "The character \\ is called backslash.";

        String textIs4 = "Hi my is saurav sarkar \n i am live in \r dhaka . Dhaka is the capital and \t largest city of Bangladesh. It is located in the \b geographic center of the country in the great deltaic region \f of the Ganges and Brahmaputra rivers. ";

        System.out.println(textIs1);

        System.out.println(textIs2);

        System.out.println(textIs3);

        System.out.println(textIs4);

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





        //Java If ... Else

        // Java if
        if(20>18){
            System.out.println("20 is greater than 18");
        }



        int hiIf = 20;
        int hiElse = 10;
        if (hiIf > hiElse){
            System.out.println("hiIf is greater than isElse");
        }



        int oneNumber = 5;
        int number = 20;
        int anotherNumber = 25;
        if (number > oneNumber && number < anotherNumber || oneNumber == 5 ) {
            System.out.println("Greater than 5");
        }






        //Java Else

        int time = 20;
        if (time < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }


        int numberIs = 5;
        int numberAre = 10;

        if (numberIs > numberAre){
            System.out.println(numberIs + " Bigger then " + numberAre);
        }else{
            System.out.println(numberIs + " smaller then " + numberAre);
        }



        //Short Hand if...else

        int timeIs = 20;
        if (timeIs < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int timeOne = 20;
        String result = (timeOne < 18) ? "Good day." : "Good evening.";
        System.out.println(result);



        int numberIsShort = 5;
        int numberAreShort = 10;

        int allNumber = (numberIsShort < numberAreShort) ? numberIsShort : numberAreShort; //(condition) ? expressionTrue :  expressionFalse;

        System.out.println(allNumber);


        //Java If ... Else Examples


        int myNum = 5;

        if (myNum % 2 == 0) {
            System.out.println(myNum + " is even");
        } else {
            System.out.println(myNum + " is odd");
        }


        int myNumber = 4;

        String myNumberIs = (myNumber % 2 == 0) ? myNumber + " is even" : myNumber + " is odd";

        System.out.println(myNumberIs);



        //Java Switch Statements


        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }




        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("Welcome Admin!");
                break;
            case "user":
                System.out.println("Welcome User!");
                break;
            case "guest":
                System.out.println("Welcome Guest!");
                break;
            default:
                System.out.println("Unknown role");
        }



        String device = "laptop";
        String os = "windows";

        switch (device) {
            case "laptop":
                switch (os) {
                    case "windows":
                        System.out.println("Install .exe installer");
                        break;
                    case "linux":
                        System.out.println("Run shell script");
                        break;
                }
                break;
            case "mobile":
                System.out.println("Install from app store");
                break;
            default:
                System.out.println("Unknown device");
        }



        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        int i = 0;
        while (i < 5) {
            System.out.println("using while loop " + i);
            i++;
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        int iWhile = 5;
        while (iWhile > 0) {
            System.out.println( " Using while loop "+ iWhile);
            iWhile--;
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        int iEven = 0;
        while (iEven <= 10) {
            if (iEven % 2 == 0) {
                System.out.println("Even numbers using while loop " + iEven);
            }
            iEven++;
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        int iSkip = 0;
        while (iSkip < 5) {
            iSkip++;
            if (iSkip == 3) {
                continue; // Skip when i is 3
            }
            System.out.println(iSkip);
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        int doWhileI = 0;
        do {
            System.out.println( "Do/while Loop " + doWhileI);
            doWhileI++;
        } while (doWhileI < 5);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        int doWhileiOne = 1;
        do {
            System.out.println("i = " + doWhileiOne);
            doWhileiOne++;

        } while (doWhileiOne < 5);


        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        int loopI = 0;
        do {
            System.out.println(loopI);
            loopI++;
        }
        while (loopI < 5);


        //Java While Loop Examples

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }



        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        Random random = new Random();
        int dice1;

        while (true) {
            dice1 = random.nextInt(10) + 1; // Random number from 1 to 6

            if (dice1 == 10) {
                System.out.println("Yatzy!");
                break; // Stop when Yatzy (6) is rolled
            } else {
                System.out.println("No Yatzy.");
            }
        }



        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        //Java For Loop

        for (int iFor = 0; iFor <= 5; iFor++) {
            System.out.println("Number " + iFor);
        }




        for (int iFor = 0; iFor <= 10; iFor = iFor + 2) {
            System.out.println("even number " + iFor);
        }

        for (int iFor = 0; iFor <= 10; iFor = iFor + 2) {
            System.out.println("even number " + iFor);
        }







    }
}