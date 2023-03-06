package seminar2.cw2;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        double x;
        int n;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        n = scanner.nextInt();
        double result = 1;
        scanner.close();
        if(n < 0) {
            n = 1 / n;
            n = n * (-1);
        }
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
            System.out.println("result="+ result);
    }

}

