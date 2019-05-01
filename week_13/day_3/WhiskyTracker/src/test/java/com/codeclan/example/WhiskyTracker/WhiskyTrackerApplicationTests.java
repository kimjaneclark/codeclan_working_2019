package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void canFindWhiskyByDistilleryIdAndAge(){
		List<Whisky> result = whiskyRepository.findWhiskiesByDistilleryIdAndAge(2L, 12);
		assertEquals(1, result.size());
	}

	@Test
	public void canGetWhiskeyFromAParticularRegion(){
		List<Whisky> result = whiskyRepository.findWhiskeyFromAParticularRegion("Highland");
		assertEquals(2, result.size());
	}



}
