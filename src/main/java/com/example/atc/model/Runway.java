package com.example.atc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.example.atc.model.Taxiway;


@Entity
public class Runway {
    @Id
    protected int id;
    
    @NotBlank
    protected String runway_name;
    protected UUID plane_id;
    
    public Runway() {
    }

    public Runway(@JsonProperty("runway_id") int id,
                  @JsonProperty("runway_name") String runway_name,
                  @JsonProperty("plane_id") UUID plane_id) {


        this.id = id;
        this.runway_name = runway_name;
        this.plane_id = plane_id;
    }

    public int getId() {
        return id;
    }

    public String getRunway_name() {
        return runway_name;
    }

    public UUID getPlane_id() {
        return plane_id;
    }
}
