package baithuchanh33;

import java.util.Scanner;

public class Slide47 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	int num;
	while(true) {
	System.out.println("nhap vao so nguyen: ");
	num = sc.nextInt();
	sum += num;
	if(sum>100) {
		System.out.println("tong cac so nguyen vua nhap ="+sum);
		break;
	}
}}}

