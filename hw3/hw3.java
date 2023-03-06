package seminar2.hw3;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
            if((mass[i] > 9 && mass[i] < 100) || (mass[i] < -9 && mass[i] > -100)){
                k+=i;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]<0){
                mass[i] = k;
            }
            System.out.print(mass[i]+" ");
        }
    }
}

