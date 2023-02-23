package com.gamul.ingredient;

import com.gamul.BaseEntity;
import lombok.Data;
import javax.persistence.Entity;


@Entity
@Data
public class Ingredient  extends BaseEntity {

    private Integer highClass;

    private String midClass;

    private String lowClass;

    private Long views;


}
