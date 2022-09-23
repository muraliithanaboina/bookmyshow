package com.bookmyshow.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Show  extends Basemodel{
    @ManyToOne
    private  Movie movie;
    private  Date startTime;
    private Date endtime;
    @ManyToOne
    private  Auditorium auditorium;
@OneToMany(mappedBy = "show")
    private List<Showseat> showseats;

@OneToMany(mappedBy = "show")
    private  List<Showseattype>showseattypes;

    @Enumerated(EnumType.STRING)
    private  Language language;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private  List<Showfeatures>showfeatures;

}
