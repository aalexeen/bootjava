package ru.javaops.bootjava;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.javaops.bootjava.user.repository.UserRepository;

import java.util.Set;

@SpringBootApplication
@AllArgsConstructor
public class BootJavaApplication {
    private final UserRepository userRepository;

        public static void main(String[] args) {
            SpringApplication.run(BootJavaApplication.class, args);
        }

}
