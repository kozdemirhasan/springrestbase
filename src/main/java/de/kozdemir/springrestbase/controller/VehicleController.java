package de.kozdemir.springrestbase.controller;

import de.kozdemir.springrestbase.model.Vehicle;
import de.kozdemir.springrestbase.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/vehicles")
public class VehicleController {

    /*
    CRUD
    POST = Create
    GET = Read (all oder one)
    PUT = Update
    DELETE = Delete
    */

    @Autowired
    private VehicleRepository vehicleRepository;

    //@RequestMapping(value = "", method = RequestMethod.GET)
    @GetMapping("")
    public List<Vehicle> index() {
        return vehicleRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Vehicle> byId(@PathVariable("id") Long id) {
        return vehicleRepository.findById(id);
    }

    @PostMapping("") // Speichern (INSERT)
    public Vehicle insert(@RequestBody Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @PutMapping("{id}") // Speichern (UPDATE)
    public Vehicle update(@PathVariable("id") Long id, @RequestBody Vehicle vehicle) {
        Optional<Vehicle> opt = vehicleRepository.findById(id);
        if(opt.isPresent()) {
            Vehicle v = opt.get();
            v.setBrand(vehicle.getBrand());
            v.setType(vehicle.getType());
            v.setRegistration(vehicle.getRegistration());
            v.setStatus(vehicle.getStatus());
            return vehicleRepository.save(v);
        }
        return new Vehicle();
    }

    @DeleteMapping("{id}") // Löschen
    public void delete(@PathVariable("id") Long id) {
        vehicleRepository.deleteById(id);
    }
}