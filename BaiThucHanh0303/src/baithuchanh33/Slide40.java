package baithuchanh33;

import java.util.Scanner;

public class Slide40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so thu tu tu 1 den 7:");
		int sothututu1den7 = sc.nextInt();
		switch(sothututu1den7) {
		case 1:
			System.out.println("chu nhat");
			break;
		case 2:
			System.out.println("thu 2");
			break;
		case 3:
			System.out.println("thu 3");
			break;
		case 4:
			System.out.println("thu 4");
			break;
		case 5:
			System.out.println("thu 5");
			break;
		case 6:
			System.out.println("thu 6");
			break;
		case 7:
			System.out.println("thu 7");
			break;
		default :
			System.out.println("khong co gia tri");
			break;
			
		}
		
	}
}
