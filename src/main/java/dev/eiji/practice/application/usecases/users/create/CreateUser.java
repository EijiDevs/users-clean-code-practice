package dev.eiji.practice.application.usecases.users.create;

import dev.eiji.practice.domain.users.ports.UserRepository;

public class CreateUser {

    private final UserRepository respository;

    public CreateUser(UserRepository respository) {
        this.respository = respository;
    }

    public void create(CreateUserDTO dto) {

    }
}
