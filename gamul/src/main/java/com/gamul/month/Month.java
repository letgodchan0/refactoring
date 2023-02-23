package com.gamul.month;

import com.gamul.BaseEntity;
import com.gamul.ingredient.Ingredient;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Month extends BaseEntity {
    private LocalDate datetime;
    private int price;
    private int type;
    @ManyToOne
    private Ingredient ingredient;
}
