package org.mozabackend.divisoesadministrativasapi.models;

import javax.persistence.*;
import java.util.List;

@Entity()
@Table(name = "distritos")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "distrito_id")
    private List<Neighborhood> neighborhoods;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Neighborhood> getNeighborhoods() {
        return neighborhoods;
    }

    public void setNeighborhoods(List<Neighborhood> neighborhoods) {
        this.neighborhoods = neighborhoods;
    }
}
