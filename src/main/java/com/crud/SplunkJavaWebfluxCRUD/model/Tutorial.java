package com.crud.SplunkJavaWebfluxCRUD.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor // <--- THIS is it
public class Tutorial {

    @Id
    private int id;

    private String title;

    private String description;

    private boolean published;

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    // getters and setters

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}