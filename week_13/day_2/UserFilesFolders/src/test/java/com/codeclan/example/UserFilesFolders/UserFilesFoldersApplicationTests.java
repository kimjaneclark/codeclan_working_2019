package com.codeclan.example.UserFilesFolders;


import com.codeclan.example.UserFilesFolders.models.File;
import com.codeclan.example.UserFilesFolders.models.Folder;
import com.codeclan.example.UserFilesFolders.models.User;
import com.codeclan.example.UserFilesFolders.repository.FileRepository;
import com.codeclan.example.UserFilesFolders.repository.FolderRepository;
import com.codeclan.example.UserFilesFolders.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserFilesFoldersApplicationTests {



	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFolderAndFiles(){
		User kim = new User("Kimberley Clark");
		userRepository.save(kim);

		User ken = new User("Ken Clark");
		userRepository.save(ken);

		Folder random = new Folder("Random Files", kim);
		folderRepository.save(random);

		Folder photos = new Folder("2018 photos", ken);
		folderRepository.save(photos);

		File letter = new File("house letter", "doc", 16, random);
		fileRepository.save(letter);

		File abiTennis = new File("Abi tennis match", "jpeg", 98, photos);
		fileRepository.save(abiTennis);

//		kim.addFolders(random);
//		userRepository.save(kim);

	}

}
