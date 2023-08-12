package buoi33;

import java.util.Scanner;

public class Bai3_Buoi3 {

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
        }
        for(int i=0; i<n-1; i++) {
        	for(int j=i+1; j<n;j++) {
        		if(a[i]>a[j]) {
        			int temp = a[i];
        			a[i] = a[j];
        			a[j] = temp;
        		}
        	}
        }
        for(int i=0; i<n; i++) {
        	System.out.print(a[i] + "  ");
        }
	}

}
