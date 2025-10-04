package dev.eiji.practice.application.usecases.users.update;

import dev.eiji.practice.domain.users.ports.UserRepository;

public class UpdateUser {
    private final UserRepository repository;

    public UpdateUser(UserRepository repository) {
        this.repository = repository;
    }

    public void update(UpdateUserDTO dto) {

    }
}
