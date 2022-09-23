package com.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Showseat extends Basemodel{
    @ManyToOne
    private  Show show;
    @ManyToOne
    private  Seat seat;
    @Enumerated(EnumType.STRING)
    private Showseatstate showseatstate;
}
