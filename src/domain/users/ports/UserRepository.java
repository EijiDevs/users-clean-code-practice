package domain.users.ports;

import domain.users.models.User;

import java.util.List;
import java.util.Optional;

/**
 * Outpur port to manage users data persistence
 * @author Esteban Perafan
 * @version 1.0
 * @since 0.1.0
 */
public interface UserRepository {
    public Optional<User> findById(String id);
    public List<User> findAll();
    public void save(User user);
    public void update(User user);
    public void delete(User user);
}
