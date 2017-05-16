package practical.first;

import java.util.Scanner;

/**
 * Created by prots on 15.05.2017.
 */
public class Rectangle{
    public static int squareRectangle(int a, int b) {
        if (a > 0 && b > 0) {
            return a * b;
        }
        else {
            throw new IllegalArgumentException("value is negative");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        try {
            a = scan.nextInt();
            b = scan.nextInt();
            scan.close();
            System.out.println(squareRectangle(a, b));
        } catch (IllegalArgumentException e) {
            System.err.print(e);
        }
    }
}
