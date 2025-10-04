package dev.eiji.practice.domain.users.models;

import java.util.Date;

/**
 * User Domain Model, don't touch it unless you know what you do
 * @author Esteban Perafan
 * @version 1.0
 * @since 0.1.0
 */
final public class User {
    private String id;
    private String username;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private Date birthDay;

    public static User create(String id, String username, String name, String lastName, String email, String password, Date birthDay) {
        return new User(id, username, name, lastName, email, password, birthDay);
    }

    private User(String id, String username, String name, String lastName, String email, String password, Date birthDay) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.birthDay = birthDay;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrettyName() {
        return String.format("%s %s", name, lastName);
    }

    public String getEmail() {
        return email;
    }

    public String changeEmail(String newEmail) {
        return newEmail;
    }

    public String getPassword() {
        return password;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public boolean isHisBirhday() {
        return birthDay.before(new Date());
    }
}

