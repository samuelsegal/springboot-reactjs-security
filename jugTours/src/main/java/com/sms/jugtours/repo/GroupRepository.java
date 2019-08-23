package com.sms.jugtours.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.jugtours.model.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
}