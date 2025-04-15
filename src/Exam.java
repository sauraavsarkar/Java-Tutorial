public class Exam {
    public static void main(String[] args){

//        Question - 1:
//        Print reverse number
//        Output: 10 9 8 7 6 5 4 3 2 1

        System.out.println("Question - 1 : ");
        System.out.print("Output: ");
        for (int i=10; i>=1; i--){
            System.out.print(i+" ");
        }
        System.out.println(" \n");


//        Question - 2:
//        Write a Java program using a for loop to print all even numbers from 1 to 20.
//        Output: 2 4 6 8 10 15 14 16

        System.out.println(" \nQuestion - 2 : ");
        System.out.print("Even numbers Output: ");
        for (int even=0; even<=20; even= even + 2 ){
            System.out.print(even+" ");
        }


//        Write a Java program using a for loop to print all odd numbers from 1 to 20.
//        Output: 1 3 5 7 9 11 13 15 17

        System.out.print("\nOdd numbers Output: ");
        for (int odd=1; odd<=20; odd= odd + 2 ){
            System.out.print(odd+" ");
        }
        System.out.println(" \n");

//        Question - 3:
//        Use a for loop to print each character of the string "JAVA" on a new line.
//
//                Output:
//                J
//                A
//                V
//                A

        System.out.println(" \nQuestion - 3: ");
        System.out.print("Output: \n");

        String text = "java";
        for (int textJava =0; textJava<text.length(); textJava++){
            System.out.println(text.charAt(textJava));
        }

//        Question - 4:
//        Sum on an odd number series
//        Output:
//        1 + 3 + 5 + 7 + 9 + 11 + 13 = 49

        int oddSum=0;
        System.out.println(" \nQuestion - 4: ");
        System.out.print("Output: ");
        for (int odd=1; odd<=21; odd= odd + 2 ){
            System.out.print(odd);
            oddSum += odd;
            if(odd < 21){
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + oddSum);

        System.out.println(" \n");

//        Question - 5:
//        Sum of Squares of First 5 Numbers
//        Output: 1² + 2² + 3² + 4² + 5² = 55

        int squaresSum=0;
        System.out.println(" \nQuestion - 5: ");
        System.out.print("Output: ");
        for (int squares=1; squares<=5; squares++ ){
            System.out.print(squares +"*"+squares);
            squaresSum += squares *squares;
            if(squares < 5){
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + squaresSum);

    }

}
