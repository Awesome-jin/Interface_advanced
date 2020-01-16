package advancedinterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Setuse {

	public static void main(String[] args) {
		// 왼쪽이 상위이면 되니까
		
		//set에 인스턴스 추가 
		Set<Integer> set = new TreeSet<Integer>(); //상위 클래스 이름이 Set이 되면 가까이서 먼저 만든걸 사용하려고 하니까 import가 안됨!
		//class이름을 바꾸기 싫으면 왼쪽을 저렇게 풀패키지이름을 다 써주면 됨!!
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(500);
		set.add(400);
		
		// 데이터를 다 출력해보자 - HashSet, LinkedHashSet, TreeSet에 따라 출력 결과가 모두 다르다!
		for (Integer temp : set) {
			System.out.println(temp);
		}

	
	}

}//end
