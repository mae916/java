package chapter4;

public class IfEx1 {
	public static void main(String[] args) {
		int num = 9;
		if (num == 10) {
			System.out.println("10 �Դϴ�.");
			if (num % 2 == 0) {
				System.out.println("¦�� �Դϴ�.");
			}
		} else { 
			System.out.println("10�� �ƴմϴ�.");
		}
		
	}
}