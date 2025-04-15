public class ForLoop {

    public static void main(String[] args){


        //Java For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("\n");

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("\n");

        //Java Nested Loops
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "," + j + " ");
            }
        }

    }
}
