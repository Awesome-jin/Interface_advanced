package advancedinterface;

import java.io.FileOutputStream;
import java.util.Properties;

public class Property_prac {

	public static void main(String[] args) {
		// property를 저장 할 수 있는 인스턴스를 생성하고 데이터 저장
		
		Properties props = new Properties();
		
		//프로퍼티를 저장해보자
		props.setProperty("name", "페르난데스");
		props.setProperty("team", "두산베어스");
		
		//어떤 언어를 해도 확인 해봐야 할 것 : property vs map(or dictionary or hashtable)
		// > 없는 key를 주었을 때 동작 방식
		String name = props.getProperty("name");
		String team = props.getProperty("team");		
		String age = props.getProperty("age");
		
		System.out.println(name);
		System.out.println(team);
		System.out.println(age);

		//props를 현재 디렉토리에 temp.xml 파일로 내보내기
		try {
			props.storeToXML(new FileOutputStream("temp.xml"), "주석");
		}
		catch(Exception e){
			System.out.println("예외 :" + e.getMessage());
		}
		
	}//end

}
