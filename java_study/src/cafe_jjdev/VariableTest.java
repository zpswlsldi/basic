package cafe_jjdev;
import java.util.Scanner;
// import java.lang.System;

public class VariableTest {
	public static void main(String[] args){
		int x = 0;
		Scanner scanner = null;
		scanner = new Scanner(System.in);// 키보드 입력값을 스캔하는 생성자 메서드.
		System.out.print("숫자입력 : ");
		x = scanner.nextInt();
		System.out.println("입력한 숫자는 " + x + "입니다.");
		System.out.printf("입력한 수는 %d입니다", x);
	}	
}
