package com.example.codeclan.pirateservice.components;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repository.PirateRepository;
import com.example.codeclan.pirateservice.repository.RaidRepository;
import com.example.codeclan.pirateservice.repository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PirateRepository pirateRepository;

    @Autowired
    ShipRepository shipRepository;

    @Autowired
    RaidRepository raidRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {



        Ship jolly = new Ship("The Jolly Roger");
        shipRepository.save(jolly);

        Ship mary = new Ship("The Maire Celeste");
        shipRepository.save(mary);

        Pirate stevie = new Pirate("Stevie", "Meiklejohn", 22, jolly);
        pirateRepository.save(stevie);

        Pirate louise = new Pirate("Louise", "Reid", 30, mary);
        pirateRepository.save(louise);

        Raid raid1 = new Raid("Codebase", 100);
        raidRepository.save(raid1);

        Raid raid2 = new Raid("Tontine", 200);
        raidRepository.save(raid2);

        stevie.addRaid(raid1);

        stevie.addRaid(raid2);
        pirateRepository.save(stevie);

        raid2.addPirate(louise);
        raidRepository.save(raid2);
    }
}
