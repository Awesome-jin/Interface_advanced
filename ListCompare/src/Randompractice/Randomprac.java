package Randompractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Randomprac {

	public static void main(String[] args) {
	
		// seed 설정 없이 랜덤 인스턴스를 생성 해보자 - seed가 현재 시간을 설정한다.
		Random r1 = new Random();
		//seed를 1번으로 설정
		Random r2 = new Random(1);
		
		//실행 할 때마다 다르게 나옴
		int result1 = r1.nextInt();
		//실행 할 때마다 동일하게 나옴
		int result2 = r2.nextInt();
		
		System.out.println("r1의 결과 :" + result1);
		System.out.println("r2의 결과 :" + result2);
		
		//빨강 , 파랑, 녹색을 랜덤하게 출력해보자 <복원추출>
		String [] colors = {"빨강", "파랑", "녹색"}; //랜덤이지만 값은 제한을 하도록 배열을 먼저 만든다.
		// 빈도 조절?? "파랑"을 늘리려면 "파랑"을 더 추가하면 됨
		String color = colors[r1.nextInt(colors.length)]; // 배열에서 배열안의 인덱스가 랜덤하게 나오도록 인덱스를 적용하는데 인덱스 숫자 값을 랜덤으로 쓰는것
		// String color = colors[r1.nextInt(4) %3]을 해도 0을 2배로 만들 수 있다. 왜? nextInt4까지면 0,1,2,3인데 3으로 나눈 나머지면 0 1 2 0 이니까!
		System.out.println("random color is : " + color); 
		
		
		// <비복원추출> : 로또 (같은 숫자가 다시 못나오는것)
		// 비복원추출은 배열을 쓸 수 없다 (중간 값을 제거하는게 안되니까 리스트를 써야 함)
		List <String> list = new ArrayList<String>();
		
		//1부터 45까지 리스트에 저장해보자
		for (int i = 1; i <=45; i=i+1)
		{
			list.add(i+"");
		}
		
		//20개의 숫자를 비복원 추출한다면?
		for (int j = 0; j<20; j=j+1) {
			String x = list.get(r1.nextInt(list.size())); // list 사이즈내에서 데이터를 추출하는 것
			list.remove(x); // 뽑은 데이터는 리스트에서 제거
			System.out.print(x + "\t");
		}
		
		System.out.print("\n");
		
		//랜덤한 문자열 만들기 - 이미지파일명 같은 걸 업로드 했을 때, 파일이름 그리고 유저를 구분하기 위한 이름 같은걸 만들때 사용
		String name = UUID.randomUUID().toString();
		System.out.println(name);
	}

}
