package ch09;


// 상속받는 클래스들이 알아서 구현하라는 뜻
// 추상클래스는 상속을 하기 위해 구현되는 클래스
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
