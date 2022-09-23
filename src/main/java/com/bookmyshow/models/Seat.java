package com.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat extends Basemodel {
    private  String seatnumber;

    @Enumerated(EnumType.STRING)
    private  Seattype seattype;
}
