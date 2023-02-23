package com.gamul;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, columnDefinition = "INT UNSIGNED")
    private Long id;

}
