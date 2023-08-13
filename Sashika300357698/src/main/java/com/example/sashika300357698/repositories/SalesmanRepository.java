package com.example.sashika300357698.repositories;

import com.example.sashika300357698.entities.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalesmanRepository extends JpaRepository<Salesman,Long> {
    List<Salesman> findStudentById(long kw);
}
