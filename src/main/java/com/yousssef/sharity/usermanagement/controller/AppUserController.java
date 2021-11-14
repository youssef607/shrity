package com.yousssef.sharity.usermanagement.controller;

import com.yousssef.sharity.usermanagement.dto.AppUserDto;
import com.yousssef.sharity.usermanagement.mapper.AppUserMappper;
import com.yousssef.sharity.usermanagement.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class AppUserController {


    private final AppUserService appUserService;
    private final AppUserMappper appUserMappper;

  //  @GetMapping("")
   // public ResponseEntity<?> finadAlll()
    //{
      //  AppUserDto dtos= appUserMappper.map(appUserService.getOne(1));
        //return  ResponseEntity.ok(dtos);
    //}
}
