package de.kozdemir.springrestbase.repository;


import de.kozdemir.springrestbase.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}