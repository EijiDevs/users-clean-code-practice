package dev.eiji.practice.application.usecases.users.get;

import java.util.Date;

/**
 * @author Esteban Perafan
 * @version 1.0
 * @since 0.1.0
 * @param username
 * @param prettyName a pretty combination of name and last name
 * @param email
 * @param birthDay
 */
public record GetUserDTO(String username, String prettyName, String email, Date birthDay) {}
