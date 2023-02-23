package com.gamul.ingredientNotNeed;

import com.gamul.BaseEntity;
import com.gamul.recipe.Recipe;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class IngredientNotNeed extends BaseEntity {

    private String ingredient;

    private String quantity;

    @ManyToOne
    private Recipe recipe;

}
