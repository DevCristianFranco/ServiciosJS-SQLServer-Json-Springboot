package com.pruebacv.workbackend.Repositories;

import com.pruebacv.workbackend.DatabaseEntity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}