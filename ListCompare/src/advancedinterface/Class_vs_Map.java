package advancedinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class_vs_Map {

	public static void main(String[] args) {
		// 번호, 이름, 팀, WPA를 저장하는 Player 클래스의 인스턴스를 만들어서 데이터를 저장해보자
		
		Player player = new Player(1, "나성범", "NC다이노스", 12.51);
		
		// 3개를 저장하는 Map을 인스턴스를 만들어서 데이터를 저장해보자
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("num",40);
		map.put("name","Dustin Nippert");
		map.put("team","두산베어스");
		map.put("WPA", 47.41);
		
		// 하나의 속성을 불러올 때는 클래스가 압도적으로 유용하다. 볼까? 점 찍으면 다 나와
		String name = player.getName();
		String name2 = (String)map.get("name"); //map은 매개변수를 직접 넣어줘야하고(문자열로 넣었으니까!) 형 변환도 해줘야 한다.

		// Map이 좋은 건 1. 전체 출력 || 2. 속성 확장 할 때 유리하다!
		// DTO 클래스의 인스턴스는 일단 속성 확장이 안돼! 클래스에서 만든 번호, 이름, 숫자, 팀, WPA만 넣을 수 있어!
		// map은 Null이 들어갈 수 있으니까 그냥 넣어버리면 됨
		map.put("ERA", 2.81);
		
		//DTO는 출력할때 반복문 사용이 안되지만 map은 keySet()으로 한꺼번에 불러오기가 가능하다.
		System.out.println(player.getNum());
		System.out.println(player.getName());
		System.out.println(player.getTeam());
		System.out.println(player.getWPA());
		System.out.println("===========================구분선");
		
		
		Set<String>keys = map.keySet();
		for(String key : keys) {
			System.out.println(key +" : "+ map.get(key));
			
			
		}
	}

}
