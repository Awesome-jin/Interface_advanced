package advancedinterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수 데이터를 저장하는 ArrayList를 만들어보자
		ArrayList<Integer> al = new ArrayList<>();
		// 데이터를 삽입하자
		al.add(10);
		al.add(30);

		/*
		 * 데이터 1개를 가져오기 Integer e = al.get(0); System.out.println(e);
		 * 
		 * // 데이터 1개를 지워보자 al.remove(0);
		 * 
		 * // 데이터 전체를 iterator로 출력해보자 for (Integer imsi : al) { System.out.print(imsi +
		 * "\t"); } System.out.println();
		 */

		// 쓰는 속도를 비교해보자 ==================================================
		// 현재 시간을 저장
		long start1 = System.currentTimeMillis();
		// 20이라는 데이터를 10만번 2번째 칸에 때려 넣어보자
		for (int i = 0; i < 100000; i = i + 1) {
			al.add(1, 20);
		}
		// 마친 후의 현재 시간 저장
		long end1 = System.currentTimeMillis();

		// RT 측정해서 결과보기
		long RT1 = end1 - start1;
		System.out.println("Arraylist의 RT: " + RT1);

		// 똑같은 작업을 linkedlist로 해보자!!
		LinkedList<Integer> ll = new LinkedList<>();
		// 데이터를 삽입하자
		ll.add(10);
		ll.add(30);

		// 현재 시간을 저장
		long start2 = System.currentTimeMillis();
		// 20이라는 데이터를 10만번 2번째 칸에 때려 넣어보자
		for (int i = 0; i < 100000; i = i + 1) {
			ll.add(1, 20);
		}
		// 마친 후의 현재 시간 저장
		long end2 = System.currentTimeMillis();

		// RT 측정해서 결과보기
		long RT2 = end2 - start2;
		System.out.println("Linkedlist의 RT: " + RT2);

		// 읽어오는 속도는 어떨까?? ==================================================
		// 현재 시간을 저장
		long start3 = System.currentTimeMillis();

		// 앞에서만든 Arraylist al의 전체 사이즈를 다 읽어보자
		for (int i = 0; i < al.size(); i = i + 1) {
			System.out.println(al.get(i));
		}
		// 마친 후의 현재 시간 저장
		long end3 = System.currentTimeMillis();

		// RT 측정해서 결과보기
		long RT3 = end3 - start3;
		System.out.println("Arraylist의 읽는속도 RT: " + RT3);

		// 이번엔 같은 작업을 linkedlist로 하자. 다시 현재 시간을 저장
		long start4 = System.currentTimeMillis();
		// Linkedlist al의 전체 사이즈를 다 읽어보자
		for (int i = 0; i < ll.size(); i = i + 1) {
			System.out.println(ll.get(i));
		}
		// 마친 후의 현재 시간 저장
		long end4 = System.currentTimeMillis();

		// RT 측정해서 결과보기
		long RT4 = end4 - start4;
		System.out.println("Linkedlist의 읽는속도 RT: " + RT4);

	}

}
