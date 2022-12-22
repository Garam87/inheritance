package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {

	public void ex1() {
		// 상속 확인
		// - Person을 상속받은 Student가 Person의 필드, 메소드를 사용할수 있는가?
		
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("===========================");
		
		Student s = new Student();
		// Person 클래스로부터 상속받은 메서드
		s.setName("오가람");
		s.setAge(30);
		s.setNationality("호주");
		// student의 메서드
		s.setGrade(1);
		s.setClassRoom(1);
		
		System.out.println(s.getGrade() + " 학년");
		System.out.println(s.getClassRoom() + " 반");
		
		// Student가 Person의 메소드 뿐 아니라, 필드도 상속 받았는지 확인
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getNationality());
		
		System.out.println("=====================================");
		
		p.breath();
		s.breath();
		p.move();
		s.move();
		
		Employee emp = new Employee();
		emp.move();
	}

	public void ex2() {
		// super() 생성자 사용 방법
 		Student std = new Student("김철수", 17, "한국사람", 1, 3);
 		
 		System.out.println(std.getName());
 		System.out.println(std.getAge());
 		System.out.println(std.getNationality());
 		System.out.println(std.getGrade());
 		System.out.println(std.getClassRoom());
 		
 		System.out.println("====================================");
		
		
	}

	public void ex3() {
		Person p = new Person("김은진", 100, "한국");
		
		// toString() 오버라이딩 테스트
		System.out.println(p.toString());
		System.out.println(p);
		// print 구문 수행 시 참조변수 명을 작성하면
		// 자동으로 toString() 메소드를 호출해서 출력한다!
		
		// super 참조변수 테스트
		
		Student std = new Student("이백점", 18, "미국", 2, 6);
		System.out.println(std.toString());
		
		Employee emp = new Employee("김근로" , 26, "한국", "땡땡증권");
		System.out.println(emp.toString());
	}


	
}
