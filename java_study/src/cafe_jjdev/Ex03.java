package cafe_jjdev;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = null;
		try{
			int num = 0;
			System.out.print("입력하는 숫자 : ");
			scan = new Scanner(System.in);
			num = scan.nextInt();
			if(num>0){
				System.out.println("위 숫자는 양수입니다.");
			}else if(num==0){
				System.out.println("위 숫자는 0입니다.");
			}else if(num<0){
				System.out.println("위 숫자는 음수입니다.");
			}
		}catch(Exception ex){
			System.out.println("정수만 입력하시기 바랍니다.");
		}finally{
			if(scan != null) try{scan.close();} catch(Exception ex){}
		}
	}
}
