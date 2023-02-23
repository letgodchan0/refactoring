package com.gamul.sigugun;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gamul.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Sigugun extends BaseEntity {
    @JsonProperty("sigugun_name")
    private String sigugunName;

}
