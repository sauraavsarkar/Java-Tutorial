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


        System.out.println("\n");
        //Java Break and Continue
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }


        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }


        //Break and Continue in While Loop
        System.out.println("\n");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        //Continue in While Loop
        System.out.println("\n");
        int j = 0;
        while (j < 10) {
            if (j == 4) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }



        //Skip even numbers
        System.out.println("\n");
        for (int k = 1; k <= 10; k++) {
            if (k % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println("Odd Number = " + k);
        }


        //break and continue with while loops
        System.out.println("\n");
        int q = 0;
        while (q < 10) {
            q++;
            if (q == 3) {
                continue; // skip when i is 3
            }
            if (q == 8) {
                break; // stop the loop at 8
            }
            System.out.println(q);
        }

    }
}
