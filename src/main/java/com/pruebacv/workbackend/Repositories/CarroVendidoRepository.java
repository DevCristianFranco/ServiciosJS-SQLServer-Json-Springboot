package com.pruebacv.workbackend.Repositories;

import com.pruebacv.workbackend.DatabaseEntity.CarroVendido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroVendidoRepository extends JpaRepository<CarroVendido, String> {
}
