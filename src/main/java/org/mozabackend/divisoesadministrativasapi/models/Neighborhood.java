package org.mozabackend.divisoesadministrativasapi.models;

import javax.persistence.*;

@Entity()
@Table(name = "bairros")
public class Neighborhood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

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
}
