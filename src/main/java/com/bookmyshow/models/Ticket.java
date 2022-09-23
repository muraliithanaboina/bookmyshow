package com.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket  extends Basemodel{
    @ManyToOne
    private  User bookedby;
    @ManyToOne
    private  Show show;
    @ManyToMany
    private List<Showseat> showseats;
    private double totalAmount;
    @Enumerated
    private Ticketstatus ticketstatus;
    private Date timeofbooking;

}
