/*
 * In this kata, you must create a digital root function.
 * A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n.
 * If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
 * This is only applicable to the natural numbers.
 */

public class DRoot {
    public static int digital_root(int n) {

        int sum = n;
        int length = String.valueOf(n).length();

        while (length > 1) {
            n = sum;
            sum = 0;
            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            length = String.valueOf(sum).length();
        }
        return sum;
    }
}

// Otra solución:

//public class DRoot {
//    public static int digital_root(int n) {
//        return (n != 0 && n % 9 == 0) ? 9 : n % 9;
//    }
//}
