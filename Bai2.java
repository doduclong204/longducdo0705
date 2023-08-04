package bai2_buoi2;

import java.util.Scanner;

public class Bai2 {
	public static long Gt(int n) {
		if(n==0)
			return 1;
		else
			return n*Gt(n-1);
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
        float S=0, P=0;
        for(int i=1; i<=n; i++) {
        	S+=1.0/i;
        	P+=Gt(i);
        }
        System.out.println("S= " + S);
        System.out.print("P= " + P);
	}

}
