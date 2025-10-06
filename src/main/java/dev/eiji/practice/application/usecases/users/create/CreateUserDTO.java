package dev.eiji.practice.application.usecases.users.create;

import java.util.Date;

public record CreateUserDTO(String username, String name, String lastName, String email, String password, Date birthDay) {}
