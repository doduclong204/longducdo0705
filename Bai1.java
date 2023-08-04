package bai1_buoi2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap vao so duong n: ");
            n = s.nextInt();

            if (n <= 0) {
                System.out.println("Nhap lai.");
            }
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
