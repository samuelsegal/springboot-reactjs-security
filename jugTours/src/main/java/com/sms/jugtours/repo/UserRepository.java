package com.sms.jugtours.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.jugtours.model.User;

public interface UserRepository extends JpaRepository<User, String> {
}