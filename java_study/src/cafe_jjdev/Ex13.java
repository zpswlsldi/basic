package cafe_jjdev;

public class Ex13 {

	public static void main(String[] args) {
		int length = 10;// 표의 몇 행 몇 열에 *를 넣는다 이런 식으로 생각해 보자.
		for(int i=1; i<=length;i++){//몇 번째 행인가?
			for(int j=1; j<=length;j++){//몇 번째 열에 *를 주느냐?
				if(j==i || j==(length+1-i)){//각 위치를 나타내는 열을 의미하는 숫자의 합은 length + 1
					System.out.print("*");
				}else{//나머지 열에는 빈 칸을 넣자
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
