package in.codecraftsbysanta.splitexpense.services;

public interface PasswordEncoder {

    String encode(String password);

    boolean matches(String plainText, String hashed);
}