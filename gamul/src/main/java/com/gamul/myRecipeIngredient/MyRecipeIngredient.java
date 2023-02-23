package com.gamul.myRecipeIngredient;

import com.gamul.BaseEntity;
import com.gamul.ingredient.Ingredient;
import com.gamul.myRecipe.MyRecipe;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;

@Entity
public class MyRecipeIngredient extends BaseEntity {
    private LocalDate createdTime;
    private int quantity;
    @ManyToOne
    private MyRecipe myRecipe;
    @ManyToOne
    private Ingredient ingredient;
}
