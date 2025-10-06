package dev.eiji.practice.domain.users.ports;

import dev.eiji.practice.domain.users.models.User;

import java.util.List;
import java.util.Optional;

/**
 * Output port to manage users data persistence
 * @author Esteban Perafan
 * @version 1.0
 * @since 0.1.0
 */
public interface UserRepository {
    public Optional<User> findByUsername(String username);
    public List<User> findAll();
    public void save(User user);
    public void update(User user);
    public void delete(User user);
}
