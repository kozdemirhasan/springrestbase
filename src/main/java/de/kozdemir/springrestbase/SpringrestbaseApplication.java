package de.kozdemir.springrestbase;

import de.kozdemir.springrestbase.model.Brand;
import de.kozdemir.springrestbase.model.Status;
import de.kozdemir.springrestbase.model.Vehicle;
import de.kozdemir.springrestbase.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringrestbaseApplication implements CommandLineRunner {

	@Autowired
	private VehicleRepository vehicleRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringrestbaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		List<Vehicle> vehicles = new ArrayList<>();

		Vehicle v = new Vehicle();
		v.setBrand(Brand.VW);
		v.setType("Polo");
		v.setRegistration("HH:AB123");
		v.setStatus(Status.ACTIVE);
		vehicles.add(v);

		Vehicle.VehicleBuilder builder = Vehicle.builder();
		builder.brand(Brand.BMW).type("3er").status(Status.ACTIVE);

		vehicles.add(builder.registration("HH:CD234").build());
		vehicles.add(builder.registration("HH:GH773").build());
		vehicles.add(builder.registration("HH:ZE225").build());

		vehicleRepository.saveAll(vehicles); // Speichert den Inhalt der Liste
		*/

	}
}
