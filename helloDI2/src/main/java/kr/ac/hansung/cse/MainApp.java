package kr.ac.hansung.cse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"kr/ac/hansung/cse/conf/animal.xml");

		// xml에 만든 3개의 bean 중 id_petOwner를 가지고 옴
		PetOwner person = (PetOwner) context.getBean("id_petOwner");
		
		// PetOwner.java에 cat이 들어오면 Meow가, dog이 들어오면 Bow Wow가 출력
		person.play();
		
		context.close();
	}

}