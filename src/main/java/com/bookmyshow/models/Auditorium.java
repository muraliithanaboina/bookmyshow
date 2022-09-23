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
public class Auditorium extends Basemodel {
    private  String name;
    @OneToMany
    private List<Seat> seats;
    private  int capacity;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Auditorinumfeatures>auditorinumfeatures;
    @ManyToOne
    private  Theatre theatre;
}
