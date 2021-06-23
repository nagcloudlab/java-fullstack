package com.example.god;

import com.example.live.Human;
import com.example.live.LivingThing;

// dev : 

// Open - Closed Principle 

public class God {

//	public void manageHuman(Human human) {
//		human.eat();
//		human.sleep();
//		human.study();
//		human.work();
//	}
//
//	public void manageAnimal(Animal animal) {
//		animal.eat();
//		animal.sleep();
//		animal.work();
//	}
//	

	public void manageLT(LivingThing lt) {
		lt.eat();
		lt.sleep();

		if (lt instanceof Human) {
			Human human = (Human) lt;
			human.study();
		}

		lt.work();
	}

}
