package kr.ac.hansung.spring.di;

public class Cat implements AnimalType {

	private String myName;

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public void sound() {
		System.out.println("Cat name = " + myName + ": " + "Meow!");
	}

}
