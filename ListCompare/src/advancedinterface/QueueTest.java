package advancedinterface;

import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		// Queue를 저장해보자
		
		PriorityQueue <String> pq = new PriorityQueue<>();
		pq.add("1. 서울 두산베어스");
		pq.add("3. 인천 SK와이번스");
		pq.add("5. 서울 LG트윈스");
		pq.add("2.서울 키움히어로즈");
		pq.add("4.창원 NC다이노스");//여기까지 하면 정렬된 순서로 접근 할 수 있는 이진 트리까지만 만든다
		
		
		// iterator로 데이터를 1개씩 꺼내와서 출력 >> 트리의 순회를 이용하지 않기 때문에 정렬이 안 될 수 있다.
		for(String imsi : pq) {
			System.out.print(imsi+"\t"); //근데 가나다 순서가 묘하게 안맞는다.
		}
		System.out.println();
		
		// 데이터 poll을 이용해서 1개씩 가져와서 출력해보기
		for(int i=0; i <5; i=i+1) { // 두번째 i<6은 i<pq.size() 같은거로 쓰는거 진짜 조심해야 한다. 왜??
			System.out.print(pq.poll()+"\t");   //pq.poll()을 돌고 나면 pq.size는 6 >> 5로 하나가 줄어버린다
		} //굳이 쓰고 싶다면 반복문 전에 int len = pq.size();와 같이 선언을 미.리. 해서 값이 안 변하는 상태로 가지고 와야한다.
		
		
	}

}
