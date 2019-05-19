package com.annayoungyeun.folio.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class InformationalText {

    private @Id
    @GeneratedValue
    Long id;
    private String category;
    private String description;

    private InformationalText() {}

    public InformationalText(String category, String description) {
        this.category = category;
        this.description = description;
    }
}
