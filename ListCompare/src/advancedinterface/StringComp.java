package advancedinterface;

import java.util.Comparator;

public class StringComp implements Comparator<String> {
	
	//문자열 비교를 위한 클래스
	@Override
	public int compare(String arg0, String arg1) {
		return arg0.compareTo(arg1);
	}

	}


