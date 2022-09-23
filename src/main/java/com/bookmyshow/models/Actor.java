package com.bookmyshow.models;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Actor extends Basemodel {
    private String name;
    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;
}
