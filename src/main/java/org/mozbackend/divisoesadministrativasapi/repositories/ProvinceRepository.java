package org.mozbackend.divisoesadministrativasapi.repositories;

import org.mozabackend.divisoesadministrativasapi.models.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {
}
