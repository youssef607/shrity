package com.yousssef.sharity.usermanagement.entity;

import com.yousssef.sharity.Base.BaseEntity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name = "sec_users")
public class AppUser extends BaseEntity<Long> {
    private String firstname;
    private String lastname;



}
