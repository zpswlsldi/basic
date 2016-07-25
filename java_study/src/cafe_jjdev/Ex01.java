package cafe_jjdev;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = null;
		try{
			int num = 0;
			int teamnum = 0;
			System.out.print("학생 번호 입력 : ");
			scan = new Scanner(System.in);
			num = scan.nextInt();
			System.out.println("입력된 학생 번호 : " + num);
			if(num<1 || num > 100){
				System.out.println("1~100까지의 정수만 입력하세요.");
			}else{
				if(num%10 == 0){
					teamnum=(num/10 - 1)*10 + 1;
					System.out.println("해당 학생 팀장 번호 : " + teamnum);
				}else{
					teamnum=num/10*10 + 1;
					System.out.println("해당 학생 팀장 번호 : " + teamnum);
				}
				/*	teamnum=(num-1)/10*10+1
				 	System.out.println("해당 학생 팀장 번호 : " + teamnum); 
				 	이 경우 조건문을 둘 필요없이 활용 가능. */
			}
		}catch(Exception ex){
			System.out.println("1~100 사이의 정수만 입력하셔야 합니다.");
		}finally{
			if(scan != null) try{scan.close();} catch(Exception ex){}
		}
	}
}
