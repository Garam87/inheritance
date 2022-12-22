package edu.kh.inheritance.model.vo;

public class Student extends Person {
	// Student 클래스에 Person 클래스 내용을 확장한다.						
	// extends
	// == Student 클래스에 Person 클래스 내용(속성, 기능)이 추가됨.
	
	//private String name;         // 이름
	//private int age;             // 나이
    //private String nationality;  // 국적
    private int grade;           // 학년
    private int classRoom;       // 반
    
    public Student() {
    	// Strudent() 객체 생성시
    	// 내부에 상속받은 Person 객체를 생성하기 위한
        // Person 생성자 호출 코드가 필요하다!!!
    	//Person();
    	super(); // super() 생성자 부모의 생성자를 호출하는 코드 자식 생성자 최상단에 있어야 함
    	
    	// * super() 생성자 미작성 시
    	// 컴파일러가 컴파일 단계에서 자동으로 추가해줌
    }	

	public Student(String name, int age, String nationality, int grade, int classRoom) {
		//this.name = name;
		//this.age = age;
		//this.nationality = nationality;
		super(name, age, nationality);
		this.grade = grade;
		this.classRoom = classRoom;
		
		// super() 생성자
		// 1. 자식 내 부모객체 생성
		// 2. 부모객체 생성 시 초기화
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + grade + " / " + classRoom;
	}
    
	
}
