package com.example.t1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Template1Repository extends JpaRepository<Template1, UUID> {
}
