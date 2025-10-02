package infraestructure.persistence.users;

import domain.models.users.User;
import domain.models.users.UserRepository;
import infraestructure.datasource.InMemoryUserStorage;

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
    public Optional<User> findById(String id) {
        var user = storage.selectById(id);

        return Optional.ofNullable(user);
    }

    @Override
    public void save(User user) {
        storage.insert(user);
    }

    @Override
    public void update(User user) {
        storage.update(user);
    }

    @Override
    public void delete(User user) {
        storage.delete(user.getId());
    }
}
