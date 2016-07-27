package cafe_jjdev;

import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		
		ArrayList<String> list = new ArrayList<String>();//배열 표현. ArrayList 활용 방법
		list.add(new String("양경화"));// ArrayList로 만들수 있는 배열은 참조 데이터 타입이다. 기본 데이터 타입은 불가.
		list.add("유경태");//고로 기본형을 객체형으로 변환하여 대신 쓸 수 있는 wrapper 타입(boxing 타입)을 이용한다고.
		System.out.println(list.get(1));
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(1));
		}
		
		for(String s : list){//for each 문.
			System.out.println(list.get(1));
		}
		
		ArrayList<Integer> nums = new ArrayList<Integer>();// 일반화(generic)
		Integer x = 10;//autoboxing
		int y = x;//autounboxing
	}
}
