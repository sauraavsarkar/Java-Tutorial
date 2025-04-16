public class Arrays {
    public static void main(String[] args){

        String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(car[0]);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);

        String[] carNew = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : carNew){
            System.out.println(i);
        }


        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);  // 10

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }


        //Sum of All Elements in an Array
        System.out.println("\n");
        int[] sumNumbers = {5, 10, 15, 20};
        int sum = 0;

        for (int num : sumNumbers) {
            sum += num;
        }

        System.out.println("Total sum: " + sum);  // 50



        //Largest Number in an Array

        System.out.println("\n");

        int[] arr = {15, 25, 9, 30, 18};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max value: " + max);  // 30


        // lowest age in the array
        System.out.println("\n");
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        int length = ages.length;
        int lowestAge = ages[0];

        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the array is: " + lowestAge);

    }



}
