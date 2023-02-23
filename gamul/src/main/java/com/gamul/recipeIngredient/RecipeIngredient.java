package com.gamul.recipeIngredient;

import com.gamul.BaseEntity;
import com.gamul.ingredient.Ingredient;
import com.gamul.recipe.Recipe;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.prefs.BackingStoreException;
@Entity
public class RecipeIngredient extends BaseEntity {

    private String quantity;

    @ManyToOne
    private Ingredient ingredient;

    @ManyToOne
    private Recipe recipe;

}
