package advancedinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DoubleArray {

	public static void main(String[] args) {

		// 각 팀 별 선수 명단 (배열의 배열을 만드는 구조)

		ArrayList<String> DS = new ArrayList<String>();
		DS.add("호세 미구엘 페르난데스");
		DS.add("정수빈");
		DS.add("권혁");
		DS.add("최주환");

		ArrayList<String> SK = new ArrayList<String>();
		SK.add("김광현");
		SK.add("노수광");
		SK.add("이재원");

		ArrayList<String> HH = new ArrayList<String>();
		HH.add("안영명");
		HH.add("김태균");
		HH.add("정근우");

		// 팀별 명단을 다시 List로 만들기
		ArrayList<ArrayList<String>> players = new ArrayList<ArrayList<String>>();
		players.add(DS);
		players.add(SK);
		players.add(HH); // 팀이 추가 되는 경우 팀 이름을 출력하기 위해 출력하는 로직을 수정

		// 데이터 출력하기
		// 전체 리스트를 하나하나의 리스트로 imsi에 대입하고 다시 imsi list값을 iterator 돌려야 한다.
		// 배열이 두개니까 두번 까줘야 함
		/*
		 * for (int i = 0; i < players.size(); i = i + 1) { if (i == 0) {
		 * System.out.print("두산 : "); } else { System.out.print("sk : "); }
		 * 
		 * ArrayList<String> imsi = players.get(i); for (String temp : imsi) {
		 * System.out.print(temp + "\t"); } System.out.print("\n"); }
		 */

		// 앞의 문제는 list의 list를 만들 때 각 list의 특징을 같이 저장하지 못하는 데 있음.
		// 팀 이름은 문자열이고 팀의 선수 명단은 배열이라 같이 List에 저장을 못해
		// 이 부분을 map이나 class로 해결을 해야 함

		// List와 팀 이름을 갖는 Map을 생성해보자
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("team", "서울두산");
		map1.put("player", DS);

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("team", "인천SK");
		map2.put("player", SK);

		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("team", "대전한화");
		map3.put("player", HH);

		// Map의 List를 생성한다
		ArrayList<Map<String, Object>> kbo = new ArrayList<Map<String, Object>>();
		kbo.add(map1);
		kbo.add(map2);
		kbo.add(map3);

		// 출력 
		for (Map<String, Object> maps : kbo) {
			System.out.print(maps.get("team") + ":"); // key를 가져오는 과정
			ArrayList<String> p = (ArrayList<String>) maps.get("player"); // key에 맞는 value가 리스트 형태기 때문에 리스트의 리스트를 까주는 작업
			for (String temp : p) {
				System.out.print(temp + "\t");
			}
			System.out.print("\n");
		}

	}// end

}
