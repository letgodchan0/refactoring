package com.gamul.year;

import com.gamul.BaseEntity;
import com.gamul.ingredient.Ingredient;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Year extends BaseEntity {

    private LocalDate datetime;

    private int price;

    @ManyToOne
    private Ingredient ingredient;
}
