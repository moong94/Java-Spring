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
		return "Ű�� " + personHeight + " �̰� �����԰� " + personWeight + " ų���� " + personSex + "�� �ֽ��ϴ�. �̸��� " + personName + " �̰� ���̴� " + personAge + "���Դϴ�.";
	}
}
