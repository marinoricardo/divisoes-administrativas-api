package org.mozabackend.divisoesadministrativasapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NeighborhoodDTO {

    private String neighborhoodName;
    private District districtName;
}
