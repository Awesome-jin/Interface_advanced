package Randompractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CherryMaster {

	public static void main(String[] args) {
		
		//오락실 슬롯머신 >> 이걸로 연습해보자!
		
		String [] image = {"#", "$", "%", "^", "&"};
		
		//Random 객체 만들기
		Random ran = new Random();
		List<String> list = new ArrayList<String>();

		for(int i =0; i<3; i=i+1) {
			String temp = image[ran.nextInt(image.length)];
			System.out.print(temp);
			list.add(temp);
		}
		
		System.out.print("\n");
		
		if(list.get(0)==list.get(1) && list.get(1)==list.get(2)) {
			System.out.println("3개 일치!");
		}
		else if(list.get(0)==list.get(1) || list.get(0) == list.get(2) || list.get(1)==list.get(2)){
			System.out.println("2개 일치!");
		}
		else
		{
			System.out.println("꽝!");
		}
	}

}
