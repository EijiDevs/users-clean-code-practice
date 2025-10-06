package dev.eiji.practice.application.usecases.users.create;

import dev.eiji.practice.application.ports.out.encryption.Encryptor;
import dev.eiji.practice.domain.users.models.User;
import dev.eiji.practice.domain.users.ports.UserRepository;

import java.util.UUID;

public class CreateUser {

    private final UserRepository respository;
    private final Encryptor encryptor;

    public CreateUser(UserRepository respository, Encryptor encryptor) {
        this.respository = respository;
        this.encryptor = encryptor;
    }

    public void create(CreateUserDTO dto) throws Exception {
        User user = User.create(
                dto.username(),
                dto.name(),
                dto.lastName(),
                dto.email(),
                encryptor.encrypt(dto.password()),
                dto.birthDay()
        );

        boolean userExistPreviously = respository.findByUsername(user.getUsername()).isPresent();
        if (userExistPreviously) {
            throw new Exception("This user already exist. Proof with other.");
        }

        respository.save(user);
    }
}
