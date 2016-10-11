package kr.ac.hansung.spring.di;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	//@Autowired //wiring by type
	//@Qualifier(value = "qt_cat")
	
	@Resource(name="dog") //wiring by name
	
	private AnimalType animal;
	

	/*public PetOwner(AnimalType animal) {
		this.animal = animal;
	}
	*/

	public void play() {
		animal.sound();
	}

}
