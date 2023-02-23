package com.gamul.myRecipe;

import com.gamul.BaseEntity;
import com.gamul.ingredient.Ingredient;
import com.gamul.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class MyRecipe extends BaseEntity {

    private String name;
    private LocalDate createdTime;
    private LocalDate updatedTime;
    private String imgUrl;
    @ManyToOne
    private User user;
}
