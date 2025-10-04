package dev.eiji.practice.application.usecases.users.delete;

import dev.eiji.practice.domain.users.ports.UserRepository;

public class DeleteUser {

    private final UserRepository repository;

    public DeleteUser(UserRepository repository) {
        this.repository = repository;
    }

    public void delete(String id) {

    }
}
