package com.madadipouya.reactive.service;

import com.madadipouya.reactive.model.User;
import reactor.core.publisher.Flux;

public interface UserService {

    Flux<User> getAllUsers();
}