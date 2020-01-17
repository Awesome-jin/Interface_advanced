package advancedinterface;

import java.util.ArrayList;
import java.util.Comparator;

public class ListSortMain {

	public static void main(String[] args) {
		// 문자열 List를 생성하고 데이터를 저장해보자
		ArrayList<String> list = new ArrayList<String>();
		list.add("최민정");
		list.add("윤성빈");
		list.add("김연아");
		list.add("진종오");

		// Comparator 인터페이스를 implements한 클래스의 인스턴스를 생성자로 만들어서 정렬한 것.
		StringComp comp = new StringComp();

		// 데이터 정렬 - comparator<>를 내놓으라고 한다.
		list.sort(comp);

		// comparator의 Anonymous class 만들기
		// Comparator c = new Comparator(); //이렇게만 하면 인터페이스라 에러난다. 인스턴스 못만드니까
		// 이 문법의 확장인 람다가 자바의 함수형 프로그래밍을 지원하므로 중요한 문법임.
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); //내림차순으로 문자열 정렬 compareTo 이용.
			}
		};
		list.sort(c);

		// 데이터 출력해보기
		for (String temp : list) {
			System.out.print(temp + "\t");
		}

	}// end

}
