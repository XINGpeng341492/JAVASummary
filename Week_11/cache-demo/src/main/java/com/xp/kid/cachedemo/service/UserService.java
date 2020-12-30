package com.xp.kid.cachedemo.service;


import java.util.List;

import org.springframework.cache.annotation.CacheConfig;

import com.xp.kid.cachedemo.entity.User;

@CacheConfig(cacheNames = "users")
public interface UserService {

    User find(int id);

    List<User> list();

    String buy(Integer userId,Integer num);

}
