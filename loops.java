public class loops {
    public static void main(String[] args) {
        // If else, elseif, break Loops - all types , continue - using normal loops

        // while

        int a = 0;

        // while

        a = 0;

        System.out.println("While loop\n");
        while (a <= 10) {
            System.out.println(a);
            a += 2;
        }

        a = 0;
        // do while
        System.out.println("Do-While loop\n");
        do {
            System.out.println(a + 1);
            a += 2;
        } while (a < 10);

        // for
        System.out.println("For loop\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println("");
        }

        a = 5;
        // if
        System.out.println("If \n");
        if (a % 2 == 0) {
            System.out.println("even number");
        }

        // else-if
        System.out.println("Else if\n");

        if (a % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        // if elseif else
        System.out.println("If else-if else\n");

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // ternary operator
        System.out.println("Ternary operator\n");

        System.out.println(time < 18 ? "Good day" : "Good Evening");

        // switch and break
        System.out.println("Switch break\n");
        int choice = 1;
        switch (choice) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Different number");
                break;
        }

        // break and continue
        System.out.println("Break continue\n");

        int n = 0;
        System.out.println(n);
        while (n == 5) {
            continue;
        }
        while (n == 10) {
            break;
        }
        n += 2;

    }
}
