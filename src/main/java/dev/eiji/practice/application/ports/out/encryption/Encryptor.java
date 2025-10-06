package dev.eiji.practice.application.ports.out.encryption;

/**
 * Output port to manage encryption use
 * @author Esteban Perafan
 * @version 1.0
 * @since 0.1.0
 */
public interface Encryptor {
    String encrypt(String plainText);
}
