package com.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Showseattype  extends Basemodel{

    @ManyToOne
    private  Show show;
    @Enumerated(EnumType.STRING)
    private  Seattype seattype;
    private  double  price;

}
