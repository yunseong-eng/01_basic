package operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.println("현금 입력 : ");
		int money = scan.nextInt();
		
		int thousand = money / 1000;
		int thousand_mod = money %= 1000; 
		
		int hundred = thousand_mod / 100;
		int hundred_mod = thousand_mod %= 100; 
		
		int ten = hundred_mod / 10;
		
		int one = hundred_mod % 10;
		
		System.out.println("천원:" + thousand + "장");
		System.out.println("백원:" + hundred + "개");
		System.out.println("십원:" + ten + "개");
		System.out.println("일원:" + one + "개");


	}

}
