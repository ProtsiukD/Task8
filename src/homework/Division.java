package homework;

import java.util.Scanner;

/**
 * Created by prots on 16.05.2017.
 */
public class Division {
    public static double div(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Division by zero");
        }

        else {
            return (a / b);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;
        try {
            a = scan.nextDouble();
            b = scan.nextDouble();
            scan.close();
            System.out.println(div(a, b));
        } catch (Exception e) {
            System.err.print(e);
        }
    }
}
