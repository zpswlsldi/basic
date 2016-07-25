package cafe_jjdev;

public class Ex09 {
	public static void main(String[] args) {
		System.out.println("2~100 사이의 소수는 몇 개인가?");
		int count = 0;
		/*
		밑 방식은 소수 내 양의 약수의 합이 소수 + 1임을 활용
		소수는 약수의 개수가 2개라는 점을 활용할 수도 있음.
		 */
		for(int num = 2 ; num<=100; num++){
			int remsum = 0;
			for(int n = 1; n<=num;n++){
				int rem = num%n;
				if(rem==0){
					remsum += n;
				}
			}
			if(remsum == num+1){
				count++;
			}
		}
		System.out.println("소수의 개수 : " + count);
	}
}
