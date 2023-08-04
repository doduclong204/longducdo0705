package baii5_buoi2;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Nhap chanh:"); 
        int a = s.nextInt();

        System.out.print("Nhap tao:");
        int b = s.nextInt();

        System.out.print("Nhap le:");
        int c = s.nextInt();
        
        int k=a;
        int m=b/2, n=c/4;
        if(k>m)
        	k=m;
        if (k>n) 
        	k=n;
        int Tong=k + 2*k + 4*k;
        System.out.print("Toi da so qua la :" + Tong);
	}

}
