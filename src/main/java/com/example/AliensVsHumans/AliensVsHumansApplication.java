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

		int damage = martian.dealDamage();
		System.out.println("Initial health: " + human.getCurrentHealth());
		System.out.println("Alien does " + damage + " damage to " + human.getName());
		human.takeDamage(damage);
		System.out.println("After taking damage, "+ human.getName() + " has " + human.getCurrentHealth() + " health");

//		System.out.println(martian.regenerateHealth(15, 55)); // Regenerates 15 health points
	}

}
