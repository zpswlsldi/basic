package cafe_jjdev;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("2014~2500년 사이 윤년");
		for(int year = 2014; year<=2500 ; year++){//2014~2500 범위
			if(year%400 == 0){//400의 배수?
				System.out.println("해당 년도 : " + year + "년");
			}else if(year%4 == 0 && year%100 != 0){//4의 배수인데 100의 배수는 아니면?
				System.out.println("해당 년도 : " + year + "년");
			}
		}
	}
}
