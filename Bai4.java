package bai4_buoi2;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Nhap a:");
        double a = s.nextDouble();

        System.out.print("Nhap b:");
        double b = s.nextDouble();

        System.out.print("Nhap c:");
        double c = s.nextDouble();
        
        double denta = b*b-4*a*c;
        if(denta<0)
        	System.out.println("Vo nghiem");
        else if (denta==0){
        	double m=-b/(2*a);
        	if(m>0)
        		System.out.println("Phuong trinh co 2 nghiem x1=" + Math.sqrt(m) + "x2=" + -1.0*Math.sqrt(m));
        	else
        		System.out.println("Vo nghiem");
        }
        else {
        	double m=(-b+Math.sqrt(denta))/(2*a);
            double n=(-b-Math.sqrt(denta))/(2*a);
            if(m>0 && n>0) {
            	System.out.println("Phuong trinh co 4 nghiem");
            	System.out.println("x1= " + Math.sqrt(m));
            	System.out.println("x2= " + -1.0*Math.sqrt(m));
            	System.out.println("x3= " + Math.sqrt(n));
            	System.out.println("x4= " + -1.0*Math.sqrt(n));
            }
            else if(m>0 && n<0) {
            	System.out.println("Phuong trinh co 2 nghiem");
            	System.out.println("x1= " + Math.sqrt(m));
            	System.out.println("x2= " + -1.0*Math.sqrt(m));
            }
            else if(m<0 && n>0) {
            	System.out.println("Phuong trinh co 2 nghiem");
            	System.out.println("x1= " + Math.sqrt(n));
            	System.out.println("x2= " + -1.0*Math.sqrt(n));
            }
            else {
            	System.out.println("Vo nghiem");
            }
        }
	} 

}
