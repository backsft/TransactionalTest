package com.TransactionalTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AllService {

	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private ParentsInformationRepo parentsInformationRepo;

	@Transactional
	public Student studentInsert(Student student) {

		Student studentInfomation = studentRepo.save(student);

		return studentInfomation;

	}

	@Transactional
	public ParentsInformation ParentsInsert(ParentsInformation parentsInformation) {

		ParentsInformation parentsInfo = parentsInformationRepo.save(parentsInformation);

		return parentsInfo;

	}


	@Transactional
	public String transactionalTest(TransactionalDTO transactionalDTO) {
		Student student = new Student(transactionalDTO.getName(), transactionalDTO.getAge());
		studentRepo.save(student);

		if (transactionalDTO.getFatherName() == null || transactionalDTO.getFatherName().isEmpty()) {
			throw new InvalidDataException("Father's name cannot be blank.");
		}

		ParentsInformation parentsInformation = new ParentsInformation(transactionalDTO.getFatherName(),
				transactionalDTO.getMotherName(), transactionalDTO.getMobileNo());
		parentsInformationRepo.save(parentsInformation);

		return "success";
	}

}
