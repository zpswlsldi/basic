package cafe_jjdev;

public class Ex10 {
	public static void main(String[] args) {
		int length = 5;
		String k = "";
		for(int i = 1; i<=length ;i++){//특정 행에서
			for(int j = 1; j<= i; j++){//행을 나타내는 수와 같은 개수만큼 *를 놓는다.
				if(j==i){
					k +="*";
					System.out.println(k);
				}
			}
		}
	}
}
