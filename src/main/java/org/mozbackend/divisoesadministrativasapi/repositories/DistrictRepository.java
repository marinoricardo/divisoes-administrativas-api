package org.mozbackend.divisoesadministrativasapi.repositories;

import org.mozabackend.divisoesadministrativasapi.models.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {
}
