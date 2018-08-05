package com.simple.memory.http.service;

import com.simple.memory.http.entity.UserInfo;

import io.reactivex.Maybe;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserInfoService {

    @GET("users/{user}")
    Maybe<UserInfo> getUserInfo(@Path("user") String user);

}
