package kr.ac.hansung.cse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	@Autowired // AnimalType을 가진 bean을 여기에 주입해달라는 뜻
	@Qualifier(value="qf_dog") // animal.xml에 qf_dog를 주입시킴 
	private AnimalType animal; 
	
	public void play() {
		animal.sound();
	}
}
