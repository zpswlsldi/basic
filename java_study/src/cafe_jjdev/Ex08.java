package cafe_jjdev;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = null;
		/*
			밑 방식은 소수 내 양의 약수의 합이 소수 + 1임을 활용
			소수는 약수의 개수가 2개라는 점을 활용할 수도 있음.
		 */
		try{
			int num = 0;
			int remsum = 0;
			System.out.print("입력값 : ");
			scan = new Scanner(System.in);
			num = scan.nextInt();
			for(int n = 1; n<=num;n++){
				int rem = num%n;
				if(rem==0){
					remsum += n;
				}
			}
			if(num<=0){
				System.out.println("음수는 입력하지 마십시오.");
			}else if(remsum == num+1){
				System.out.println("입력하신 값은 소수입니다.");
			}else if(remsum != num+1){
				System.out.println("입력하신 값은 소수가 아닙니다.");
			}
		}catch(Exception ex){
			System.out.println("숫자만 입력하세요.");
		}finally{
			if(scan != null) try{scan.close();}catch(Exception ex){}
		}
	}
}
