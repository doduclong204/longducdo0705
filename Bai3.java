package bai3_buoi2;

import java.util.Scanner;

public class Bai3 {

	public static boolean snt(int x) {
		if(x<2)
			return false;
		for(int i=2; i<=Math.sqrt(x); i++) {
			if(x%i==0)
				return false;
		}
		return true;

	}
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
        if(snt(n)==true) {
        	System.out.print(n + " la so nguyen to");
        }
        else {
        	System.out.print(n + " khong phai la so nguyen to");
        }
        		
        }
	}

