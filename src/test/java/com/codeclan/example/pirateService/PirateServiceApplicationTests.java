package com.codeclan.example.pirateService;

import com.codeclan.example.pirateService.models.Pirate;
import com.codeclan.example.pirateService.models.Raid;
import com.codeclan.example.pirateService.models.Ship;
import com.codeclan.example.pirateService.repositories.PirateRepository;
import com.codeclan.example.pirateService.repositories.RaidRepository;
import com.codeclan.example.pirateService.repositories.ShipRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

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
		Pirate pirate = new Pirate("Jack", "Sparrow", 36, ship);
		pirateRepository.save(pirate);
		Raid raid = new Raid("Ransack Aldis");
		raidRepository.save(raid);
		pirate.addRaid(raid);
		pirateRepository.save(pirate);
	}

}
