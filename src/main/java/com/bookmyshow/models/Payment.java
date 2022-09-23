package com.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment extends Basemodel {

    @Enumerated(EnumType.STRING)
private  Paymentmethod paymentmethod;
private Date timeofpayment;
private Double amount;
private  String referenceid;

    @Enumerated(EnumType.STRING)
private Paymentstatus paymentstatus;
@ManyToOne
private  Ticket ticket;
}
