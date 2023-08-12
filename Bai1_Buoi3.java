package buoi33;

import java.util.*;

public class Bai1_Buoi3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap n: ");
            n = s.nextInt();
        } while (n <= 0);

        System.out.println("Nhap mang:");
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            b[i]=1;
        }

        for (int i = 0; i < n; i++) {
            int dem = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    dem++;
                    b[j] = 0;
                }
            }
            if (b[i] != 0) {
                b[i] = dem;
            }
        }

        System.out.println("So lan xuat hien cua tung phan tu:");
        for (int i = 0; i < n; i++) {
            if (b[i] != 0) {
                System.out.println(a[i] + ": " + b[i] + " lan");
            }
        }
    }
}
