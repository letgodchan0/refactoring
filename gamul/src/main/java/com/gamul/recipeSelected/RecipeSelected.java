package com.gamul.recipeSelected;

import com.gamul.BaseEntity;
import com.gamul.recipe.Recipe;
import com.gamul.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class RecipeSelected extends BaseEntity {

    private Boolean activeFlag;

    private LocalDate createdTime;

    private LocalDate updatedTime;

    @ManyToOne
    private User user;

    @ManyToOne
    private Recipe recipe;
}
