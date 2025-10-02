package domain.models.users;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    public Optional<User> findById(String id);
    public List<User> findAll();
    public void save(User user);
    public void update(User user);
    public void delete(User user);
}
