package chapter10.interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) { // ���������� ������ ������ ���� 0�� �Ǹ� �ȵ�
		if(num2 != 0) {
			return num1 / num2;
		}
		return ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�."); 
	}

}