package com.example.AliensVsHumans;

import models.Alien;
import models.AlienRace;
import models.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliensVsHumansApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AliensVsHumansApplication.class, args);
		Alien martian = new Alien(AlienRace.MARTIAN);
		Human human = new Human("Boog", 50, true, 100);

		int alienDamageDealt = martian.dealDamage();
		System.out.println("Initial health: " + human.getCurrentHealth());
		System.out.println("Alien does " + alienDamageDealt + " damage to " + human.getName());
		human.takeDamage(alienDamageDealt);
		System.out.println("After taking damage, "+ human.getName() + " has " + human.getCurrentHealth() + " health");
		System.out.println("-------- Human turn to attack ---------");

		int humanDamageDealt = human.dealDamage();
		System.out.println("Initial health: " + martian.getCurrentHealth());
		System.out.println(human.getName() + " does " + humanDamageDealt + " damage to alien!");
		martian.takeDamage(humanDamageDealt);
		System.out.println("After taking damage, the alien has " + martian.getCurrentHealth() + " health");

//		System.out.println(martian.regenerateHealth(15, 55)); // Regenerates 15 health points
	}

}
