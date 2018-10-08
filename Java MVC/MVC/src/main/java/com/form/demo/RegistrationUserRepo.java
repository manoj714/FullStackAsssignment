package com.form.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationUserRepo extends JpaRepository<RegistrationUser, Long>{

}
