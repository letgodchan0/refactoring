package com.gamul.notice;

import com.gamul.BaseEntity;
import com.gamul.ingredient.Ingredient;
import com.gamul.ingredientPriceNotice.IngredientPriceNotice;
import com.gamul.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Notice extends BaseEntity {

    private Boolean type;
    private LocalDate createdTime;
    @ManyToOne
    private IngredientPriceNotice ingredientPriceNotice;
}
