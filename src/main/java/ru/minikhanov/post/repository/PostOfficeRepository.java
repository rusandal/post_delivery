package ru.minikhanov.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.minikhanov.post.domain.PostOffice;

public interface PostOfficeRepository extends JpaRepository<PostOffice, Long> {
    boolean existsByPostIndex (Integer postIndex);
}
