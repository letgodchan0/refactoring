package com.gamul.price;

import com.gamul.BaseEntity;
import com.gamul.ingredient.Ingredient;
import com.gamul.store.Store;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Price extends BaseEntity {

    private LocalDate dateTime;

    private String unit;

    private String quantity;

    private int type;

    private int price;

    @ManyToOne
    private Ingredient ingredient;

    @ManyToOne
    private Store store;

}
