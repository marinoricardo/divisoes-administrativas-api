package org.mozabackend.divisoesadministrativasapi.models;

public class NeighborhoodDTO {

    private String neighborhoodName;
    private District districtName;

    public NeighborhoodDTO(String neighborhoodName, District districtName) {
        this.neighborhoodName = neighborhoodName;
        this.districtName = districtName;
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    public void setNeighborhoodName(String neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
    }

    public District getDistrictName() {
        return districtName;
    }

    public void setDistrictName(District districtName) {
        this.districtName = districtName;
    }
}
