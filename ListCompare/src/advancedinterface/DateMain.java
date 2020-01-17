package advancedinterface;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateMain {

	public static void main(String[] args) {
		
		Date date = new Date(2020,1,17);  //3920년 2월 17일이 된다!!!
		System.out.println(date);   //year는 year-1990. month는 month-1로 해야 함.
		Date orddate = new Date(120,0,17);
		System.out.println(orddate);

		
		// Calendar 클래스의 인스턴스를 만들어보자 : 주의 인스턴스를 못만드는 추상 클래스
		Calendar calen = Calendar.getInstance(); // 이 문법은 Calendar 클래스의 인스턴스를 만드는게 아님
		// Calendar 클래스를 상속받은 클래스의 Anonymous class를 생성해서 인스턴스를 만든 후 리턴
		// Java에서 인터페이스나 추상클래스를 리턴 타입으로 하는 모든 메소드는 이 원리가 적용된다.
		
		System.out.println(calen); //ToString이 너무 많은 데이터를 리턴하기때문에 보기가 어렵다.
		
		// 위의 값을 필요한 데이터만 추출해보자.
		System.out.println(calen.get(Calendar.MONTH)+1); //월은 0부터 시작하니까 출력은 꼭 +1
		
		//<주의> 1월부터 12월까지 날 수를 배열에 저장해보자!
		int [ ] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //0부터 카운트 하니까 0을 넣어버리면 인지와 맞게 쓸 수 있다.
	
		// 2월의 날짜를 가져와!
		// month[2]; 
		
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.DD"); //날짜를 문자열로 바꿔주는 클래스 - 생성자 매개변수로 어떤 날짜를 받아야 하는지 필요함
		String msg = sdf.format(today);
		System.out.println();
	}

}
