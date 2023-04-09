package com.madadipouya.reactive.service.impl;

import com.github.javafaker.Faker;
import com.madadipouya.reactive.model.User;
import com.madadipouya.reactive.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.UUID;

@Service
public class DefaultUserService implements UserService {

    private final Faker faker;

    public DefaultUserService() {
        this.faker = new Faker();
    }

    @Override
    public Flux<User> getAllUsers() {
        return Flux.interval(Duration.ofSeconds(1)).map(i -> createRandomUser());
    }

    private User createRandomUser() {
        return new User(UUID.randomUUID().toString(), faker.name().fullName());
    }
}
