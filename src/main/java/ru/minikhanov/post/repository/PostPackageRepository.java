package ru.minikhanov.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.minikhanov.post.domain.PostalPackage;

@Repository
public interface PostPackageRepository extends JpaRepository<PostalPackage, Long> {

}
