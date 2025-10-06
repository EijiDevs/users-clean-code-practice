package dev.eiji.practice.infraestructure.encryption;

import dev.eiji.practice.application.ports.out.encryption.Encryptor;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Base 64 Encryptor Adapter
 * @author Esteban Perafan
 * @version 1.0
 * @since 0.1.0
 */
public class Base64Encryptor implements Encryptor {

    @Override
    public String encrypt(String plainText) {
        return Base64.getEncoder().encodeToString(plainText.getBytes(StandardCharsets.UTF_8));
    }

}
