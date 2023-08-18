package org.mozabackend.divisoesadministrativasapi.controllers;

import org.mozabackend.divisoesadministrativasapi.models.District;
import org.mozabackend.divisoesadministrativasapi.models.Neighborhood;
import org.mozabackend.divisoesadministrativasapi.repositories.DistrictRepository;
import org.mozabackend.divisoesadministrativasapi.repositories.NeighborhoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class DistrictController {
    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private NeighborhoodRepository neighborhoodRepository;

    @GetMapping("/districts")
    public ResponseEntity<List<District>> getDistricts() {
        List<District> districts = this.districtRepository.findAll();
        return ResponseEntity.ok().body(districts);
    }

    @GetMapping("/neighborhoods")
    public ResponseEntity<List<Neighborhood>> getNeighborhoods() {
        List<Neighborhood> neighborhoods = this.neighborhoodRepository.findAll();
        return ResponseEntity.ok().body(neighborhoods);

    }
}