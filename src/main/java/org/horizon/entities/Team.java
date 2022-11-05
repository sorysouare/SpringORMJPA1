package org.horizon.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Team implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeam;
    @Column(length = 100)
    private String name;

    public Team() {
    }

    public Team(Long idTeam, String name) {
        this.idTeam = idTeam;
        this.name = name;
    }

    public Long getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Long idTeam) {
        this.idTeam = idTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
