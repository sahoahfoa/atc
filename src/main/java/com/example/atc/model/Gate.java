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

import com.example.atc.model.Taxiway;

@Entity
public class Gate {
    @Id
    protected int id;
    
    @NotBlank
    protected String gate_name;
    protected UUID plane_id;

    @ManyToMany
    Set<Taxiway> taxiways;

    public Gate() {
    }

    public Gate(@JsonProperty("gate_id") int id,
                @JsonProperty("gate_name") String gate_name,
                @JsonProperty("taxiways") Set<Taxiway> taxiways) {

        this.id = id;
        this.gate_name = gate_name;
        this.taxiways = taxiways;
    }

    public int getId() {
        return id;
    }

    public String getGate_name() {
        return gate_name;
    }

    public UUID getPlane_id() {
        return plane_id;
    }

    public Set<Taxiway> getTaxiways() {
        return taxiways;
    }

    public void setTaxiways(Set<Taxiway> taxiways) {
        this.taxiways = taxiways;
    }
}
