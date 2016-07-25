package cafe_jjdev;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("2014~2500년 사이 윤년");
		for(int year = 2014; year<=2500 ; year++){
			if(year%400 == 0){
				System.out.println("해당 년도 : " + year + "년");
			}else if(year%4 == 0 && year%100 != 0){
				System.out.println("해당 년도 : " + year + "년");
			}
		}
	}
}
