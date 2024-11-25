package com.TransactionalTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentInformationController {

	@Autowired
	private AllService allService;

	@PostMapping
	public Student insertStudent(@RequestBody Student student) {

		Student studentInsert = allService.studentInsert(student);

		return studentInsert;

	}

	@PostMapping("/parents")
	public ParentsInformation insertParents(@RequestBody ParentsInformation parentsInformation) {

		ParentsInformation parentsInsert = allService.ParentsInsert(parentsInformation);

		return parentsInsert;

	}

	@PostMapping("/transactionalTest")
	public String transactionalTest(@RequestBody TransactionalDTO transactionalDTO) {

		String transactionalTest = allService.transactionalTest(transactionalDTO);

		return transactionalTest;

	}

}
