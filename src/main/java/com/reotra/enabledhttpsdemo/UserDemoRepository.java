package com.reotra.enabledhttpsdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserDemoRepository extends JpaRepository<UserDemo, UUID> {
}
