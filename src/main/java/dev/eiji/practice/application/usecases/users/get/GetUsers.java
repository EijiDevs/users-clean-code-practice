package dev.eiji.practice.application.usecases.users.get;

import dev.eiji.practice.domain.users.ports.UserRepository;

import java.util.Collections;
import java.util.List;

public class GetUsers {

    private final UserRepository repository;

    public GetUsers(UserRepository repository) {
        this.repository = repository;
    }

    public List<GetUserDTO> getAll() {
        return Collections.emptyList();
    }
}
