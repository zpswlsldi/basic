package cafe_jjdev;

public class StudentMain {

	public static void main(String[] args) {
		Ban ban = new Ban();	
		Student s = new Student();
		Student s1 = new Student();
		ban.init("202");
		
		System.out.println(ban.list.size() + " : 초기화 후");
		
		Student ky = new Student();
		ky.name = "전채은";
		ky.age = 20;
		ky.work = false;
		
		ban.insertStudent(ky);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student ka = new Student();
		ka.name = "김용";
		ka.age = 29;
		ka.work = false;
		
		ban.insertStudent(ka);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kb = new Student();
		kb.name = "강현";
		kb.age = 28;
		kb.work = false;
		
		ban.insertStudent(kb);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kc = new Student();
		kc.name = "최수빈";
		kc.age = 25;
		kc.work = false;
		
		ban.insertStudent(kc);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kd = new Student();
		kd.name = "유경태";
		kd.age = 29;
		kd.work = false;
		
		ban.insertStudent(kd);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student ke = new Student();
		ke.name = "양경화";
		ke.age = 27;
		ke.work = false;
		
		ban.insertStudent(ke);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kf = new Student();
		kf.name = "박장용";
		kf.age = 26;
		kf.work = false;
		
		ban.insertStudent(kf);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kg = new Student();
		kg.name = "박학철";
		kg.age = 28;
		kg.work = false;
		
		ban.insertStudent(kg);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kw = new Student();
		kw.name = "김진산";
		kw.age = 36;
		kw.work = false;
		
		ban.insertStudent(kw);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student ku = new Student();
		ku.name = "김창훈";
		ku.age = 26;
		ku.work = false;
		
		ban.insertStudent(ku);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kv = new Student();
		kv.name = "김우영";
		kv.age = 27;
		kv.work = false;
		
		ban.insertStudent(kv);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kh = new Student();
		kh.name = "양정익";
		kh.age = 32;
		kh.work = false;
		
		ban.insertStudent(kh);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student ki = new Student();
		ki.name = "이예은";
		ki.age = 23;
		ki.work = false;
		
		ban.insertStudent(ki);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kj = new Student();
		kj.name = "윤상섭";
		kj.age = 30;
		kj.work = false;
		
		ban.insertStudent(kj);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kk = new Student();
		kk.name = "정미애";
		kk.age = 30;
		kk.work = false;
		
		ban.insertStudent(kk);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kl = new Student();
		kl.name = "신선";
		kl.age = 26;
		kl.work = false;
		
		ban.insertStudent(kl);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student km = new Student();
		km.name = "양상열";
		km.age = 32;
		km.work = false;
		
		ban.insertStudent(km);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kn = new Student();
		kn.name = "이은진";
		kn.age = 25;
		kn.work = false;
		
		ban.insertStudent(kn);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student ko = new Student();
		ko.name = "박정영";
		ko.age = 25;
		ko.work = false;
		
		ban.insertStudent(ko);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kp = new Student();
		kp.name = "김의기";
		kp.age = 24;
		kp.work = false;
		
		ban.insertStudent(kp);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kq = new Student();
		kq.name = "장현호";
		kq.age = 23;
		kq.work = false;
		
		ban.insertStudent(kq);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kr = new Student();
		kr.name = "김복근";
		kr.age = 28;
		kr.work = false;
		
		ban.insertStudent(kr);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student ks = new Student();
		ks.name = "이진호";
		ks.age = 28;
		ks.work = false;
		
		ban.insertStudent(ks);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		Student kt = new Student();
		kt.name = "김호";
		kt.age = 19;
		kt.work = false;
		
		ban.insertStudent(kt);
		
		System.out.println(ban.list.size() + " : 입력 후");
		
		ban.printStudentList();
		ban.deleteStudentByName("전채은");
		System.out.println("\n");
		ban.printStudentList();
		ban.updateStudent("김용", true);
		System.out.println("\n");
		ban.printStudentList();
		s = ban.studentMemberInsert("전채은", 20, false);
		ban.insertStudent(s);
		
		System.out.println("\n");
		ban.printStudentList();
		ban.insertStudentList(s1, "예시", 11, true);
		System.out.println("\n");
		ban.printStudentList();
	}
}
