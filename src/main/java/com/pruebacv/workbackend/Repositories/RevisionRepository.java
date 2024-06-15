package com.pruebacv.workbackend.Repositories;

import com.pruebacv.workbackend.DatabaseEntity.Revision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RevisionRepository extends JpaRepository<Revision, Integer> {
}