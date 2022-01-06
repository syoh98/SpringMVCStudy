package kr.ac.hansung.cse;

import lombok.Setter;

@Setter
public class Cat implements AnimalType {

	private String myName;

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cat name=" + myName + ": " + "Meow");
	}

}
