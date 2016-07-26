package cafe_jjdev;

public class Ex09 {
	public static void main(String[] args) {
		System.out.println("2~100 사이의 소수는 몇 개인가?");
		int count = 0;
		/*
		밑 방식은 소수 내 양의 약수의 합이 소수 + 1임을 활용
		소수는 약수의 개수가 2개라는 점을 활용할 수도 있음.
		 */
		for(int num = 2 ; num<=100; num++){//2~100까지의 숫자
			int remsum = 0;
			for(int n = 1; n<=num;n++){//1부터 num까지의 숫자
				int rem = num%n;//나머지
				if(rem==0){//약수?
					remsum += n;//결과적으로는 num의 약수의 합
				/*
					remsum대신 약수의 개수를 나타내는 변수를 선언하고(remcount로 함)
					remcount++;
					
					이후 if 조건문에서 remcount == 2 를 조건으로 내세우면 된다.
				*/
				}
			}
			if(remsum == num+1){//소수?
				count++;//소수의 개수를 담는 변수에 담기
			}
			
		}
		System.out.println("소수의 개수 : " + count);
	}
}
