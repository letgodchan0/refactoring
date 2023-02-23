package com.gamul.recipe;

import com.gamul.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Recipe extends BaseEntity {

    private String name;

    private String thumbnail;

    private String information;

    private Long views;


}
