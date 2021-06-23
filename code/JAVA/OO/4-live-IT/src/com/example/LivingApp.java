package com.example;

import com.example.god.God;
import com.example.live.Animal;
import com.example.live.Human;
import com.example.live.LivingThing;
import com.example.live.Male;
import com.example.live.Robot;

public class LivingApp {

	public static void main(String[] args) {

		God god = new God();

		System.out.println("--------------------------");
		System.out.println("Human");
		System.out.println("--------------------------");

		Human maleHuman = new Male();
		god.manageLT(maleHuman);

		System.out.println("--------------------------");
		System.out.println("Animal");
		System.out.println("--------------------------");

		Animal animal = new Animal();
		god.manageLT(animal);

		System.out.println("--------------------------");
		System.out.println("Robot");
		System.out.println("--------------------------");

		Robot robot = new Robot();
		god.manageLT(robot);

//		LivingThing livingThing=new LivingThing();

	}

}
