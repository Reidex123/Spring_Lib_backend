package com.lib.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long categoryId;

    private String name;
}
