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
			for(int n = 1; n<=num;n++){//1부터 입력값까지
				int rem = num%n;//입력값까지의 수로 나눈 나머지
				if(rem==0){//약수니?
					remsum += n;
					/*
					remsum이라는 약수의 합을 담는 변수가 아닌, 약수의 개수를 담는 변수를 선언(remcount).
					remcount++;
					
					이후 if문에서 remcount == 2 는 소수 조건으로, remcount != 2는 소수가 아닌 조건으로. 
					이런 방식도 가능.
					*/
				}
			}
			if(num<=0){//음수니?
				System.out.println("음수는 입력하지 마십시오.");
			}else if(remsum == num+1){//소수는 양의 약수를 1과 그 자신만 가지므로 약수의 합계가 자신 + 1
				System.out.println("입력하신 값은 소수입니다.");
			}else if(remsum != num+1){//그 외
				System.out.println("입력하신 값은 소수가 아닙니다.");
			}
		}catch(Exception ex){//예외 사항 발생 시 멘트 출력하는 부분. 
			System.out.println("숫자만 입력하세요.");
		}finally{
			if(scan != null) try{scan.close();}catch(Exception ex){}
		}
	}
}
