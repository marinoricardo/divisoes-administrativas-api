package org.mozbackend.divisoesadministrativasapi.controllers;

import org.mozabackend.divisoesadministrativasapi.models.District;
import org.mozabackend.divisoesadministrativasapi.models.Province;
import org.mozabackend.divisoesadministrativasapi.repositories.DistrictRepository;
import org.mozabackend.divisoesadministrativasapi.repositories.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/provinces")
public class ProvinceController {
    @Autowired
    private ProvinceRepository provinceRepository;

    @GetMapping("")
    public List<Province> getAllProvinces(){
        List<Province> provinces = this.provinceRepository.findAll();
        return provinces;
    }

    @GetMapping("{province_id}")
    public ResponseEntity<Optional<Province>> getDistricts(@PathVariable Long province_id){
        Optional<Province> province = this.provinceRepository.findById(province_id);
        return ResponseEntity.ok().body(province);
    }
}
