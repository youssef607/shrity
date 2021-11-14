package com.yousssef.sharity.usermanagement.dto;

import com.yousssef.sharity.Base.BaseDto.BaseDto;
import com.yousssef.sharity.usermanagement.entity.AppUser;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppUserDto extends BaseDto<Long> {
    private String firstname;
    private String lastname;

}

