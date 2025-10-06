package dev.eiji.practice.infraestructure.persistence.users;

import dev.eiji.practice.domain.users.models.User;
import dev.eiji.practice.domain.users.ports.UserRepository;
import dev.eiji.practice.infraestructure.datasource.InMemoryUserStorage;

import java.util.List;
import java.util.Optional;

/**
 * @author Esteban Perafan
 * @version 1.0
 * @since 0.1.0
 */
final public class InMemoryUserRepository implements UserRepository {

    private final InMemoryUserStorage storage;

    public InMemoryUserRepository() {
        this.storage = InMemoryUserStorage.create();
    }

    @Override
    public List<User> findAll() {
        var users = storage.selectAll();

        return users;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        var user = storage.selectByUsername(username);

        return Optional.ofNullable(user);
    }

    @Override
    public void save(User user) {
        if(storage.selectByUsername(user.getUsername()) != null) {
            return;
        }

        storage.insert(user);
    }

    @Override
    public void update(User user) {
        storage.update(user);
    }

    @Override
    public void delete(User user) {
        storage.delete(user.getUsername());
    }
}
