package com.gamul.store;

import com.gamul.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Store extends BaseEntity {

    private String name;

    private Double latitude;

    private Double longitude;
}
