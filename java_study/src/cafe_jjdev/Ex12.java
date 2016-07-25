package cafe_jjdev;

public class Ex12 {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++){//각 단에서 공통으로 곱하는 숫자
			for(int j=2; j<=9; j++){//단
				System.out.print(j+"*"+i+"="+j*i+" ");
			}
			System.out.println("");
		}
	}

}
