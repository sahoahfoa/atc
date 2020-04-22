package com.example.atc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
public class Plane {
    @Id
    protected UUID plane_id;
    @NotBlank
    protected String tail_number;
    protected String state;
    protected long last_action;
    protected int distance;
    protected int altitude;
    protected int speed;
    protected int heading;

    public Plane() {
    }

    public Plane(@JsonProperty("plane_id") UUID plane_id,
                 @JsonProperty("tail_number") String tail_number,
                 @JsonProperty("state") String state,
                 @JsonProperty("last_action") long last_action,
                 @JsonProperty("distance") int distance,
                 @JsonProperty("altitude") int altitude,
                 @JsonProperty("speed") int speed,
                 @JsonProperty("heading") int heading) {


        this.plane_id = plane_id;
        this.tail_number = tail_number;
        this.state = state;
        this.last_action = last_action;
        this.distance = distance;
        this.altitude = altitude;
        this.speed = speed;
        this.heading = heading;
    }

    public UUID getPlane_id() {
        return plane_id;
    }

    public String getTail_number() {
        return tail_number;
    }

    public String getState() {
        return state;
    }

    public long getLast_action() {
        return last_action;
    }

    public int getDistance() {
        return distance;
    }

    public int getAltitude() {
        return altitude;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHeading() {
        return heading;
    }


}
