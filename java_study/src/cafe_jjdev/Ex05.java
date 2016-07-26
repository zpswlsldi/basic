package cafe_jjdev;

public class Ex05 {
	public static void main(String[] args) {
		for(int num = 1;num<=50;num++){//1~50까지의 수들
			if(num%5==0){//5의 배수 출력
				System.out.println("5의 배수 중 하나 : " + num);
			}
		}
	}
}
