package org.mozbackend.divisoesadministrativasapi.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "provincias")
@Getter
@Setter
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String latitude;
    private String longitude;
    private String area;
    @OneToMany
    @JoinColumn(name = "provincia_id")
    private List<District> districts;

}
