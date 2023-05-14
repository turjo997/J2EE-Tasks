package com.ullash.springwebjpa.repository;

import com.ullash.springwebjpa.model.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer , Integer> {
}
