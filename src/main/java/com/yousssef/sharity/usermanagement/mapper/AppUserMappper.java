package com.yousssef.sharity.usermanagement.mapper;

import com.yousssef.sharity.Base.BaseMapper.BaseMapper;
import com.yousssef.sharity.usermanagement.dto.AppUserDto;
import com.yousssef.sharity.usermanagement.entity.AppUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppUserMappper extends BaseMapper<AppUser, AppUserDto> {


}
