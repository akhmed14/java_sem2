package seminar2.hw2;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] mass = new int [n];
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        boolean flag = true;
        for (int i = 1; i < mass.length; i++) {
            if(mass[i]<=mass[i-1]){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Массив является  возрастающей ");
        }
        else {
            System.out.println("Массив не является  возрастающей ");
        }
    }
}
