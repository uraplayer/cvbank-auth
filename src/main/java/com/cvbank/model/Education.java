package com.cvbank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Education {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String institution;
    private String degree;
    private int yearEnd;
    private String location;
    private String note;

    @JsonIgnore
    //@JsonManagedReference
    @ManyToOne
    @JoinColumn(name="cv_id")
    private CV cv;
}
