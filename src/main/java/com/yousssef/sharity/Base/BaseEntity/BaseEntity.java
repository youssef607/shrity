package com.yousssef.sharity.Base.BaseEntity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity<ID extends Number> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ID id;

    private Integer statusCode;

    @Column(updatable = false)
    private LocalDate createdDate;

    @Column(updatable = false)
    private String createdUser;

    private LocalDate modifiedDate;
    private String modifiedUser;
}
