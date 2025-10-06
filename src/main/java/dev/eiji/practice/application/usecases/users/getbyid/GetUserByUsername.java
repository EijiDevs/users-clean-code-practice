package dev.eiji.practice.application.usecases.users.getbyid;

import dev.eiji.practice.application.usecases.users.get.GetUserDTO;
import dev.eiji.practice.domain.users.models.User;
import dev.eiji.practice.domain.users.ports.UserRepository;

import java.util.Optional;

/**
 * @author Esteban Perafan
 * @version 1.0
 * @since 0.1.0
 */
final public class GetUserByUsername {
    private final UserRepository repository;

    public GetUserByUsername(UserRepository repository) {
        this.repository = repository;
    }

    public GetUserDTO get(String username) throws Exception {
        Optional<User> optionalUser = repository.findByUsername(username);

        if (optionalUser.isEmpty()) throw new Exception("User doesn't exist.");

        User user = optionalUser.get();

        return new GetUserDTO(
                user.getUsername(),
                user.getPrettyName(),
                user.getEmail(),
                user.getBirthDay()
        );
    }
}
