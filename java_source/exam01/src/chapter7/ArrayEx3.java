package chapter7;

public class ArrayEx3 {
	public static void main(String[] args) {
		char[] alpha = new char[26]; // 2����Ʈ�� �� 52���� ���� ���� -> �ε��� ��ȣ�� ���� 
		char ch = 'A'; // ���� 65
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = ch++;
			// ch++ -> ch(char) + 1(int) -> int(������ ����ȯ -> char
		}
		
		for (int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i]);
		}
	}
}