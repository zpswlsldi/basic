package cafe_jjdev;

public class Ex10 {
	public static void main(String[] args) {
		int length = 5;
		String k = "";
		for(int i = 1; i<=length ;i++){
			for(int j = 1; j<= i; j++){
				if(j==i){
					k +="*";
					System.out.println(k);
				}
			}
		}
	}
}
