public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            // cifra se divide
            int digit = x % 10;
            // se imparte nr. la 10
            x /= 10;
//Daca trece de intervalul de dreapta atunci 0
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            //Daca trece de intervalul de stanga atunci 0

            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
// rezultatul va fi inmultit cu 10 + cifra
            result = result * 10 + digit;
        }

        return result;
    }


}
