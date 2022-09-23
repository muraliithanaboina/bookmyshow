package com.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Theatre  extends Basemodel{
    private  String name;
    private  String Address;
        @OneToMany(mappedBy = "theatre")
    private List<Auditorium> auditoriums;
        @OneToMany
    private List<Show>upcomingmovies;
}
