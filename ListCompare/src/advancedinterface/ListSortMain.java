package advancedinterface;

import java.util.ArrayList;

public class ListSortMain {

	public static void main(String[] args) {
		// 문자열 List를 생성하고 데이터를 저장해보자
		ArrayList <String> list = new ArrayList<String>();
		list.add("김연경");
		list.add("김연아");
		list.add("윤성빈");
		list.add("진종오");
		
		// Comparator 인터페이스를 implements한 클래스의 인스턴스를 생성자로 만들어서 정렬한 것. 
		StringComp comp = new StringComp();
		
		// 데이터 정렬 - comparator<>를 내놓으라고 한다.
		list.sort(comp);
		
		//데이터 출력해보기
		for(String temp : list) {
			System.out.print(temp + "\t");
		}
		
	}//end

}
