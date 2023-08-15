package com.example.maven_1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<StudentInformation,Integer> {
}
