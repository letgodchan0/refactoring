package com.gamul.user;

import com.gamul.BaseEntity;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class User extends BaseEntity {

    private String username;

    private String password;

    private Boolean activeFlag;

    private LocalDate createdTime;

    private LocalDate updatedTime;

    private String refreshToken;
}
