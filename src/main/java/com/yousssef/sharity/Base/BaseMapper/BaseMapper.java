package com.yousssef.sharity.Base.BaseMapper;



public interface BaseMapper <T,DTO>{

        DTO map(T t);

        T unMap(DTO dto);

}
