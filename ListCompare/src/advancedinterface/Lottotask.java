package advancedinterface;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lottotask {

	public static void main(String[] args) {
		// 돌아온 로또 task. 1부터 45사이의 숫자를 6개 입력 받아서 오름차순 정렬해서 출력해보자!
		// 데이터 6개는 하나의 이름으로 저장해야 한다.
		// 데이터 6개를 하나의 이름으로 저장 할 수 있는 자료 구조 : ArrayList, LinkedList, Stack,
		// PriorirtyQueue, ArrayDeque, Set

		Scanner sc = new Scanner(System.in);
		Set<Integer> lottoset = new TreeSet<Integer>();

		for (int i = 0; i < 6; i = i + 1) {
			try {
				System.out.println("1부터 45의 숫자를 입력하세요: ");
				int number = sc.nextInt();

				// 1부터 45사이의 숫자인지 먼저 검사하자
				if (number < 1 || number > 45) {
					System.err.println("1부터 45 사이의 수만 입력하세요!");
					i = i - 1;
					continue;
				}

				// 입력받은 숫자를 lottoset에 추가하고 숫자가 중복되면 false
				boolean result = lottoset.add(number);
				if (result == false) {
					System.err.println("중복은 불가능 합니다");
					i = i - 1;
					continue;
				}
			} catch (Exception e) {
				System.err.println("숫자만 입력하세요!!");
				i = i - 1;
				sc.nextLine();
			}

		}
		
		// 6개의 값 출력해보기
		for (Integer temp : lottoset) {
			System.out.print(temp + "\t");
		}
		sc.close();
	}
}
