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
final public class GetUserById {
    private final UserRepository repository;

    public GetUserById(UserRepository repository) {
        this.repository = repository;
    }

    public GetUserDTO get(String id) throws Exception {
        Optional<User> optionalUser = repository.findById(id);

        if (optionalUser.isEmpty()) throw new Exception("User doesn't exist.");

        User user = optionalUser.get();

        return new GetUserDTO(
                user.getId(),
                user.getUsername(),
                user.getPrettyName(),
                user.getEmail(),
                user.getBirthDay()
        );
    }
}
