package com.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie  extends Basemodel{
    private  String name;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Language> languageList;
    @ManyToMany
    private List<Actor>actors;
    private int length;
    private  double rating;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private  List<Moviefeatures>moviefeatures;


}
