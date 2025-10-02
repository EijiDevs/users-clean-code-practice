package application.usecases.users.get;

import domain.models.users.User;
import domain.models.users.UserRepository;

import java.util.Optional;

/**
 * @author Esteban Perafan
 * @version 0.1.0
 */
final public class GetUserById {
    private final UserRepository repository;

    public GetUserById(UserRepository repository) {
        this.repository = repository;
    }

    public GetUserByIdDTO get(String id) throws Exception {
        Optional<User> optionalUser = repository.findById(id);

        if (optionalUser.isEmpty()) throw new Exception("User doesn't exist.");

        User user = optionalUser.get();

        return new GetUserByIdDTO(
                user.getId(),
                user.getUsername(),
                user.getPrettyName(),
                user.getEmail(),
                user.getBirthDay()
        );
    }
}
