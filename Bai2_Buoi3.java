package buoi33;

import java.util.*;

public class Bai2_Buoi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("nhap so pt trong mang: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        System.out.println("nhap mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("them hay xoa? (them: 1, xoa: 2): ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("vi tri them: ");
            int position = scanner.nextInt();
            
            if (position < 0 || position > n) {
                System.out.println("khong hop le!");
                return;
            }
            
            System.out.print("gia tri moi: ");
            int newValue = scanner.nextInt();
            
            int[] newArr = new int[n + 1];
            for (int i = 0; i < position; i++) {
                newArr[i] = arr[i];
            }
            newArr[position] = newValue;
            for (int i = position + 1; i < n + 1; i++) {
                newArr[i] = arr[i - 1];
            }
            
            System.out.print("ket qua: ");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        } else if (choice == 2) {
            // Xóa phần tử
            System.out.print("vi tri can xoa: ");
            int position = scanner.nextInt();
            
            if (position < 0 || position >= n) {
                System.out.println("khong hop le!");
                return;
            }
            
            int[] newArr = new int[n - 1];
            for (int i = 0, j = 0; i < n; i++) {
                if (i != position) {
                    newArr[j++] = arr[i];
                }
            }
            
            System.out.print("ket qua: ");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("khong hop le!");
        }
    }
}
