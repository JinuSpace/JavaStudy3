package com.iu.s1.student;



import com.iu.s1.student.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		//make Student 호출
		// 이름,번호,국어 영어,수학 출력
		Student Student = new Student();
		StudentUtil studentUtil = new StudentUtil();
		
		studentUtil.makeStudents();                       // 이부분 수정
		Student [] students  = studentUtil.makeStudents();//이부분 수정
		//Student student =studentUtil.makeStudent();
		
		for(int i = 0;i<students.length;i++) {
		Student student = students[i];
			
			System.out.println("이름 :" + student.name);
		System.out.println("번호 :" + student.num);
		System.out.println("국어 :" + student.kor);
		System.out.println("영어 :" + student.eng);
		System.out.println("수학 :" + student.math);
		
		}
		
		
		
	}	

}