package cafe_jjdev;

import java.util.ArrayList;

public class Ban {
	String name;
	ArrayList<Student> list;
	// 반 초기화
	void init(String name){
		this.name = name;
		this.list = new ArrayList<Student>();
	}
	// list에 입력했던 학생 데이터를 추가하는 메서드
	void insertStudent(Student studentmember){// 유효성 검사는 매우 중요하다. 추가해보자.
		if(studentmember == null){
			System.out.println("입력값이 null입니다.");
		}else{
			for(Student s : this.list){//추가적으로 검사해보자. 나이, 여부 등.
				if(s.name.equals(studentmember)){//추가되는 데이터에 같은 이름이 없을 경우에 유용하다.
					System.out.println("중복된 이름입니다.");
					return;//메서드를 끝낸다. 
				}
			}
			this.list.add(studentmember);
		}
	}
	// 학생 데이터 입력 메서드(이름, 나이, 취업여부만 입력해서 주소값을 리턴받고자 할 때)
	Student studentMemberInsert(String name, int age, boolean work){
		Student s = new Student();
		s.name = name;
		s.age = age;
		s.work = work;
		/*	아래 메서드와 연동하는 '주소값 리턴 후 변수를 list에 추가하는 방식'인데, 
			그런 번거로움 없이 '리턴값 없이 바로 list에 추가하는 방식'도 생각할 수 있다.*/  
		return s;
	}
	// 데이터 입력, 입력된 데이터를 list에 추가하는 메서드
	void insertStudentList(Student studentmember,String name, int age, boolean work){
		Student s = studentmember;
		s.name = name;
		s.age = age;
		s.work = work;
		this.list.add(studentmember); 
		System.out.println(list.size() + " : 입력 후");
	}
	// list의 학생들을 콘솔창에 출력하는 메서드
	void printStudentList(){
		for(Student s : this.list){
			System.out.println("이름 : " + s.name + "\t나이 : " + s.age + "\t취업 여부 : " + s.work);
		}
	}	
	// list에 담겨 있는 학생 데이터들을 리턴하는 메서드
	ArrayList<Student> selectAll(){
		return this.list;
	}
	// list 내에 있는 해당 학생을 삭제하는 메서드
	void deleteStudentByName(String name){
		for(int i=0; i<this.list.size(); i++){
			Student s = this.list.get(i);
			if(name.equals(s.name)){
				this.list.remove(i);
				/*	boolean 변수 선언 및 초기화 후 이 조건일 때 변수 값을 달리 한다.
				 	이후 boolean 변수에 담긴 값에 따라 오류문구나 성공문구 출력. flag?	*/
			}
		}
	}
	// list 내에 있는 해당 학생의 work값을 수정하는 메서드
	void updateStudent(String name, boolean work){
		for(Student s : this.list){
			if(name.equals(s.name)){
				s.work = work;
			}
		}
	}
	
}
