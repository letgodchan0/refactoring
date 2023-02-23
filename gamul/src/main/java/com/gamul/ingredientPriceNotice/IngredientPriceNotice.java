package com.gamul.ingredientPriceNotice;

import com.gamul.BaseEntity;
import com.gamul.ingredient.Ingredient;
import com.gamul.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class IngredientPriceNotice extends BaseEntity {

    private Boolean activeFlag;

    private int upperLimitPrice;

    private int lowerLimitPrice;


    private LocalDate createdTime;

    private LocalDate updatedTime;

    @ManyToOne
    private User user;

    @ManyToOne
    private Ingredient ingredient;

}
