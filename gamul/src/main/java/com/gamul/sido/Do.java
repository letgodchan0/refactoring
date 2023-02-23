package com.gamul.sido;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gamul.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Do extends BaseEntity {
    @JsonProperty("do_name")
    private String doName;
}
