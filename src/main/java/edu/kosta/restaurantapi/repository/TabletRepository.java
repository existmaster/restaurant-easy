package edu.kosta.restaurantapi.repository;

import edu.kosta.restaurantapi.domain.Tablet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TabletRepository extends JpaRepository<Tablet, Long> {
}
