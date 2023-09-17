package org.mozabackend.divisoesadministrativasapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity()
@Table(name = "distritos")
@Getter
@Setter
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "distrito_id")
    private List<Neighborhood> neighborhoods;
}
