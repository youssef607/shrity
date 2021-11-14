package com.yousssef.sharity.usermanagement.repository;


import com.yousssef.sharity.Base.BaseRepository.BaseRepository;
import com.yousssef.sharity.usermanagement.entity.AppUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends BaseRepository<AppUser,Long> {


}
