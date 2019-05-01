package com.codeclan.example.pirateService;

import com.codeclan.example.pirateService.models.Pirate;
import com.codeclan.example.pirateService.models.Raid;
import com.codeclan.example.pirateService.models.Ship;
import com.codeclan.example.pirateService.repositories.PirateRepository;
import com.codeclan.example.pirateService.repositories.ShipRepository;
import com.codeclan.example.pirateService.repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateServiceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPirateAndShipAndRaid(){
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);
		Pirate pirate = new Pirate("Jack", "Sparrow", 42, ship);
		pirateRepository.save(pirate);
		Raid raid = new Raid("Ransack Aldis");
		raidRepository.save(raid);
		pirate.addRaid(raid);
		pirateRepository.save(pirate);
	}



}
