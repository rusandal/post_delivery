package ru.minikhanov.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.minikhanov.post.domain.DeliveryStatus;

public interface DeliveryStatusRepository extends JpaRepository<DeliveryStatus, Long> {

}
