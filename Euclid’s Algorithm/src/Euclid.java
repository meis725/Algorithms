/**
 * Created by Song on 9/22/16.
 * Euclid's Algorithm
 * The idea of Euclid's Algorithm implemented in Java, the most important part is you can
 * get largest/smallest number of divisions by using this program, all you have to do is
 * search "count == ?" in the output console.
 *
 */
public class Euclid {

    private static int count = 0; // <- initializing
    public static void main (String[] args) {
        /* uncomment this part if you want to input from keyboard, and place the variables into the for loops.
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter m: ");
        int i = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Enter n: ");
        int j = reader.nextInt(); // Scans the next token of the input as an int.
        gcd(m,n);*/

        for (int n = 30; n > 0; n--) {
           for (int m = 30; m > 0; m--) {
                gcd(m,n);
           }
        }
    }

    private static void gcd(int m, int n) {
        while (n != 0) {
            System.out.printf("m = %d ****** n = %d\n", m, n);
            int r = m % n;
            m = n;
            n = r;
            count++;
            gcd(m, n);
        }

        if ((n == 0) && count!= 0) {
            System.out.printf("Count = %d\n",count);
            count = 0;
        }
    }
}
