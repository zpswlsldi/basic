package cafe_jjdev;

public class TimeMain {
	public static void main(String[] args) {
		Time t1 = null;
		t1 = new Time();
		t1.hour = 10;
		Time t2 = new Time();
		t2.hour = 11;
		Time t3 = t1;
		t3.hour = 24;
				
		System.out.println(t1.hour);
		
		int x = 10;
		int y = x;
		y = 20;
		System.out.println(x);
	}

}
