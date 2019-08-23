package com.sms.jugtours.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.jugtours.model.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
	List<Group> findAllByUserId(String id);
    Group findByName(String name);
}