package application.usecases.users;

import domain.models.users.UserRepository;

final public class GetUserById {
    private final UserRepository repository;

    public GetUserById(UserRepository repository) {
        this.repository = repository;
    }
}
