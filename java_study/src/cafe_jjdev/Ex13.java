package cafe_jjdev;

public class Ex13 {

	public static void main(String[] args) {
		int length = 10;
		for(int i=1; i<=length;i++){//몇 번째 행인가?
			for(int j=1; j<=length;j++){//몇 번째 열에서 *를 주느냐?
				if(j==i || j==(length+1-i)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
