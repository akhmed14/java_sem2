package seminar2.cw2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num2 = scanner.nextInt();
            if(num % 2 == 0 && num2 % 10 == 5){
                sum+=num;
            }

        }
        scanner.close();
        System.out.println();
    }
}
