package cafe_jjdev;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = null;
		try{
			int num1 = 0;
			int num2 = 0;
			System.out.print("첫 번째 사람의 나이 : ");
			scan = new Scanner(System.in);
			num1 = scan.nextInt();
			System.out.print("두 번째 사람의 나이 : ");
			num2 = scan.nextInt();
			if(num1>= 20 && num1 < 30){
				if(num2>=20 && num2 < 30){
					System.out.println("두 분 다 출입가능하십니다.");
				}else{
					System.out.println("출입금지");
				}
			}else if(num1 <= 0 || num2 <= 0){
				System.out.println("음수는 입력하실 수 없습니다.");
			}else{
				System.out.println("출입금지");
			}
		}catch(Exception ex){
			System.out.println("숫자만 입력하십시오.");
		}finally{
			if(scan != null) try{scan.close();} catch(Exception ex){}
		}
	}
}
