public class Main {
        public static void main(String[] args) {
            ReverseInteger solution = new ReverseInteger();

            // Exemplul 1
            int x1 = 123;
            int reversed1 = solution.reverse(x1);
            System.out.println("Reversed of " + x1 + " is: " + reversed1);

            // Exemplul 2
            int x2 = -123;
            int reversed2 = solution.reverse(x2);
            System.out.println("Reversed of " + x2 + " is: " + reversed2);

            // Exemplul 3
            int x3 = 120;
            int reversed3 = solution.reverse(x3);
            System.out.println("Reversed of " + x3 + " is: " + reversed3);
        }
    }
