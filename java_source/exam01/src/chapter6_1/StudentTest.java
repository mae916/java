package chapter6_1;

public class StudentTest {
	public static void main(String[] args) {
		// �л� -> ���� -> �й��� �ڵ� ����(serialNum - static)
		// �й��� �ڵ� �����ϰ� �߱� -> �߱� �� ������ �й��� ��� ����.
		Student st1 = new Student(); // 1
		Student st2 = new Student(); // 2
 		Student st3 = new Student(); // 3
		System.out.println("st1 �й� = " + st1.getStudentID());
		System.out.println("st2 �й� = " + st2.getStudentID());
		System.out.println("st3 �й� = " + st3.getStudentID());
		
		int sum = 0;
		 
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
	}
}