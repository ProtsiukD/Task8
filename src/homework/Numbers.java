package homework;

import java.util.Scanner;

/**
 * Created by prots on 16.05.2017.
 */
public class Numbers {
    public static int readNumber(int start, int end) throws Exception {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number >= start && number <= end) {
            return number;
        } else {
            throw new Exception("Enter the number from diapason "+start + "-" + end+".");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(readNumber(1, 50));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}