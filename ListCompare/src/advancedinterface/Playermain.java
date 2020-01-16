package advancedinterface;

import java.util.Comparator;
import java.util.LinkedList;

public class Playermain {

	public static void main(String[] args) {
		// 매개변수가 없는 생성자를 이용한 인스턴스 생성 및 필드값 설정
		Player player1 = new Player();
		player1.setNum(1);
		player1.setName("오재원");
		player1.setTeam("두산베어스");
		player1.setWPA(1.00);
		
		//매개변수가 있는 생성자를 이용해서 만들기
		Player player2 = new Player(2, "박건우", "두산베어스", 12.51);
		Player player3 = new Player(3, "허경민", "두산베어스", 13.42);
		Player player4 = new Player(4, "양의지", "NC다이노스", 22.51);
		Player player5 = new Player(5, "김현수", "LG트윈스", 9.32);
		Player player6 = new Player(6, "이원석", "삼성라이온스", 13.51);
		
		//5개의 인스턴스를 소유한 Linkedlist 인스턴스를 만들어보자
		LinkedList<Player> linklist = new LinkedList<>();
		linklist.add(player1);
		linklist.add(player2);
		linklist.add(player3);
		linklist.add(player4);
		linklist.add(player5);
		linklist.add(player6);
		
		//출력만 해보자
		for (Player player : linklist) {
			System.out.println(player);
		}
		System.out.println("================================");
		
		//sort를 쓰려니까 Comparator가 필요하단다. Player 클래스의 인스턴스 비교 인스턴스 
		Comparator <Player> comp = new Comparator<Player>() {
			
			@Override  //Sort하는 이 방법은 데이터베이스의 OrderBy알고리즘으로 재활용 할 수 있다! 
			public int compare(Player arg0, Player arg1) {
				// WPA의 오름차순으로 쏘트해보자
				/*
				if(arg0.getWPA() > arg1.getWPA()) {
					return  1;
				}
				else if(arg0.getWPA() == arg1.getWPA()) {
					return  0;
				}
				else  {
					return  -1;
				}
				*/
				return arg0.getName().compareTo(arg1.getName()); //이름순으로 정렬을 해보자! String은 .compareTo로 바로 비교 가능
			}
		};

		//리스트의 소트를 해보자
		linklist.sort(comp);
		
		//정렬한 데이터로 다시 출력 해보자
		for (Player imsi : linklist) {
			System.out.println(imsi);
		}
		
	}	

}// end
