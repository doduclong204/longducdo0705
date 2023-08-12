package buoi33;

import java.util.Scanner;

public class Bai4_Buoi3 {

	static boolean kiemtra(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap:");
		String a = s.nextLine();
		if (kiemtra(a)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}

}
