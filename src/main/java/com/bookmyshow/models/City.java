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
public class City extends Basemodel {
    private String name;
    @OneToMany
    private List<Theatre> theatres;
}
