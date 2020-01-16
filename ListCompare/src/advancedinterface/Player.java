package advancedinterface;

public class Player {
	
	// 야구 선수 관련 데이터를 만들어보자 (선수번호 - primary key, 선수 이름, 소속, WPA)
	private int num;
	private String name;
	private String team;
	private double WPA;
	
	//인스턴스들을 private으로 만들어서 인스턴스가 접근을 못함
	//인스턴스가 필드에 접근 할 수 있도록 해주는 메소드
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public double getWPA() {
		return WPA;
	}

	public void setWPA(double wPA) {
		WPA = wPA;
	}

	//필드의 값을 빠르게 확인하기 위한 디버깅 메소드 : toString();
	@Override
	public String toString() {
		return "Player [num=" + num + ", name=" + name + ", team=" + team + ", WPA=" + WPA + "]";
	}

	//매개변수가 없는 생성자 만들기
	public Player() {
		super();
	}
	
	public Player(int num, String name, String team, double WPA) {
		super();
		this.num = num;
		this.name = name;
		this.team=team;
		this.WPA =WPA;
	}

}
