package infraestructure.datasource;

import domain.users.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Singleton in memory storage to proofs without real infrastructure behind
 * This class emulate an SQL Database
 * @author Esteban Perafan
 * @version 1.0
 * @since 0.1.0
 */
final public class InMemoryUserStorage {
    private static InMemoryUserStorage instance;
    private final Map<String, User> users;

    private InMemoryUserStorage() {
        this.users = new HashMap<>();
    }

    public static InMemoryUserStorage create() {
        if (instance == null) {
            instance = new InMemoryUserStorage();
        }
        return instance;
    }

    public List<User> selectAll() {
        return new ArrayList<>(users.values());
    }

    public User selectById(String id) {
        return users.get(id);
    }

    public void insert(User user) {
        users.put(user.getId(), user);
    }

    public void update(User user) {
        users.put(user.getId(), user);
    }

    public void delete(String id) {
        users.remove(id);
    }
}
