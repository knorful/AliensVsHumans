package com.example.AliensVsHumans;

import models.Alien;
import models.AlienRace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliensVsHumansApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AliensVsHumansApplication.class, args);
		Alien martian = new Alien(AlienRace.MARTIAN);

		System.out.println("Initial health: " + martian.getCurrentHealth());
		martian.takeDamage(5);
		System.out.println("After taking damage: " + martian.getCurrentHealth());

		System.out.println(martian.regenerateHealth(15, 55)); // Regenerates 15 health points
	}

}
