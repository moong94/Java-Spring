package ch09;


// ��ӹ޴� Ŭ�������� �˾Ƽ� �����϶�� ��
// �߻�Ŭ������ ����� �ϱ� ���� �����Ǵ� Ŭ����
public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	
	void turnOn() {
		System.out.println("turnOn");
	}
	
	void turnOff() {
		System.out.println("turnOff");
	}
}
