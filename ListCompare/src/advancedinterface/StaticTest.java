package advancedinterface;

import java.util.Stack;

public class StaticTest {

	public static void main(String[] args) {
		// 문자열을 저장하는 Stack을 만들어보자
		Stack <String> stack = new Stack<>();
		
		//데이터 저장은 push!
		stack.push("바다");
		stack.push("유진");
		stack.push("슈");
		
		//마지막 데이터를 제거하면서 가져오기
		String ses = stack.pop();
		System.out.println(ses);
		System.out.println(stack); //슈가 빠진 걸 알 수 있다.
		
		//마지막 데이터를 제거를 안하고 가져와보기
		ses = stack.peek();
		System.out.println(ses);
		System.out.println(stack); // 유진이 빠지지 않았다.
		ses = stack.peek(); //다시 마지막 값을 빼보아도 똑같이 유진이다.
	}

}
