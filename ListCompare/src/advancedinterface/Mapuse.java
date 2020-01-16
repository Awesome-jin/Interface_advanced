package advancedinterface;

import java.util.HashMap;
import java.util.Set;

public class Mapuse {

	public static void main(String[] args) {
		
		
		// Map 인스턴스 생성
		HashMap<String, Object> map1 = new HashMap<String,Object>();
		
		
		// map1에 데이터를 넣어보자
		map1.put("baseball", "야구");
		map1.put("football", "축구");
		map1.put("hockey", "하키");
		map1.put("archery","양궁");
		
		//데이터 가져오기
		String obj = (String)map1.get("archery"); //value의 자료형은 Object기 때문에 원하는 형태로 강제 형 변환을 해야한다.
		System.out.println(obj);
		
		//없는 키를 가져와보면 어떻게 될까? : 결과는 이미 알고 있긴해.. null
		String obj2 = (String)map1.get("skating");
		System.out.println(obj2);
		
		//Map의 모든 데이터를 출력  - key의 이름을 사용하지 않음
		System.out.println("======================================");
		
		//모든 key의 값을 값을 가져오자
		Set<String> keys = map1.keySet();
		
		//Set을 iterator 돌리자
		for (String imsi : keys) {
			System.out.println(imsi +":" + map1.get(imsi));
		}

	}

}
