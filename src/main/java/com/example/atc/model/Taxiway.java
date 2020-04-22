package com.example.atc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import java.util.UUID;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.example.atc.model.Runway;
import com.example.atc.model.Gate;


@Entity
public class Taxiway {
    @Id
    protected int id;
    
    @NotBlank
    protected String taxiway_name;
    protected UUID plane_id;

    @ManyToMany
    Set<Gate> gates;
    
    public Taxiway() {
    }

    public Taxiway(@JsonProperty("taxiway_id") int id,
                   @JsonProperty("taxiway_name") String taxiway_name,
                   @JsonProperty("gates") Set<Gate> gates) {


        this.id = id;
        this.taxiway_name = taxiway_name;
        this.gates = gates;

    }

    public int getId() {
        return id;
    }

    public String getTaxiway_name() {
        return taxiway_name;
    }

    public UUID getPlane_id() {
        return plane_id;
    }

    public Set<Gate> getGates() {
        return gates;
    }

    public void setGates(Set<Gate> gates) {
        this.gates = gates;
    }
}
