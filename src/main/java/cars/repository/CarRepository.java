package cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cars.beans.Car;

/**
 * Cameron Mockobee - cmockobee1@dmacc.edu
 * CIS175 - Fall 2023
 * Oct 17, 2023
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
