package org.mozabackend.divisoesadministrativasapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity()
@Table(name = "bairros")
@Getter
@Setter
public class Neighborhood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
