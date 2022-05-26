package ch08;

public class PersonInfo {

	public int personHeight;
	public int personWeight;
	public String personSex;
	public String personName;
	public int personAge;
	
	
	public PersonInfo(int personHeight, int personWeight, String personSex, String personName, int personAge) {
		this.personHeight = personHeight;
		this.personWeight = personWeight;
		this.personSex = personSex;
		this.personName = personName;
		this.personAge = personAge;
	}
	
	public String PersonInfoShow() {
		return "키가 " + personHeight + " 이고 몸무게가 " + personWeight + " 킬로인 " + personSex + "이 있습니다. 이름은 " + personName + " 이고 나이는 " + personAge + "세입니다.";
	}
}
