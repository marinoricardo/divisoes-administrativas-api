package org.mozabackend.divisoesadministrativasapi.repositories;

import org.mozabackend.divisoesadministrativasapi.models.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodRepository extends JpaRepository<Neighborhood, Long> {
}
