package chapter2;

public class Variable1 {
	public static void main(String[] args) {
		int num; // ����(�ڷ��� ������ -> �ڷ��� ��ŭ ������ ����)
		// �뷮 ��ŭ ���ڸ� �Է�(2�� 32��Ʈ)
		num = 10; // num ������ 10�� �����Ѵ�(������ �����Ѵ�)
		
		System.out.println(num);
		
		double num2 = 20000000.0; //
		System.out.println(num2);
		
		long num3 = 200000000000L; // 64��Ʈ(8����Ʈ)����
		// int num3 = 200000000000; -> num3 = (long)200000000000;
		System.out.println(num3);
		
		
		// ���� - ���� 
		int age = 40;
		System.out.println("���̴� " + age);
	}
}