package cafe_jjdev;

public class Ex06 {
	public static void main(String[] args) {
		int sum = 0;
		for(int num = 1 ; num <= 10 ; num++){//1~10까지의 수
			if(num%2 == 1){//2n+1?2n-1?
				sum += num;//2n+1?2n-1?인 num의 합계
			}
		}
		System.out.println("합계 : " + sum);
	}
}
