package chapter13_3;

import java.util.ArrayList;

public class StreamEx3 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
<<<<<<< HEAD
		list.add(new Student(1001, "이름1", 20));
		list.add(new Student(1002, "이름2", 22));
		list.add(new Student(1003, "이름3", 25));
		list.add(new Student(1004, "이름4", 32));
=======
		list.add(new Student(1001, "?씠由?1", 20));
		list.add(new Student(1002, "?씠由?2", 22));
		list.add(new Student(1003, "?씠由?3", 25));
		list.add(new Student(1004, "?씠由?4", 32));
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
		
		
		//list.stream().forEach(s -> System.out.println(s.getName()));
		
		//list.stream().filter(s -> s.getAge() < 30).map(s -> s.getName()).forEach(s -> System.out.println(s));
		int age = list.stream().filter(s -> s.getAge() < 30).mapToInt(s -> s.getAge()).max().getAsInt();
		System.out.println(age);
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
