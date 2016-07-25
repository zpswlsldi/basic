package cafe_jjdev;

public class Ex06 {
	public static void main(String[] args) {
		int sum = 0;
		for(int num = 1 ; num <= 10 ; num++){
			if(num%2 == 1){
				sum += num;
			}
		}
		System.out.println("합계 : " + sum);
	}
}
