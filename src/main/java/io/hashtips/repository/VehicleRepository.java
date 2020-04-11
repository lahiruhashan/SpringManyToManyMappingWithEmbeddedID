package io.hashtips.repository;

import io.hashtips.domain.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
    Vehicle findByVehicleId(Long vehicleId);
}
