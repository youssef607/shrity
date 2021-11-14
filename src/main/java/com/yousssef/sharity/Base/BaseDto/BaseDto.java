package com.yousssef.sharity.Base.BaseDto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public class BaseDto<ID extends Number> {
    private ID id;

    private Integer statusCode;
}
