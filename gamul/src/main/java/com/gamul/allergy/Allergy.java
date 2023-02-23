package com.gamul.allergy;

import com.gamul.BaseEntity;
import com.gamul.ingredient.Ingredient;
import com.gamul.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Allergy extends BaseEntity {
    private Boolean activeFlag;

    private LocalDate createdTime;

    private LocalDate updatedTime;

    @ManyToOne
    private User user;

    @ManyToOne
    private Ingredient ingredient;

}
