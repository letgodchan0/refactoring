package com.gamul.recipeOrder;

import com.gamul.BaseEntity;
import com.gamul.recipe.Recipe;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class RecipeOrder extends BaseEntity {
    private String description;

    private int descOrder;

    private String imagePath;

    @ManyToOne
    private Recipe recipe;

}
