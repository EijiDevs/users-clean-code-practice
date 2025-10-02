package domain.models.users;

import java.util.List;

public interface UserRepository {
    public User findById(String id);
    public List<User> findAll();
    public void save(User user);
    public void update(User user);
    public void delete(User user);
}
