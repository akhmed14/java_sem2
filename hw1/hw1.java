package seminar2.hw1;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
            int j = 2;
            if (mass[i]<2 || mass[i] != 2 && mass[i]%j==0 && j < mass[i] ) {
                j++;
            }
            else {
              sum+=mass[i];
            }
        }
        System.out.println(sum);
    }
}
