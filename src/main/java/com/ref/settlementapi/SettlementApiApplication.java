package com.ref.settlementapi;

import com.ref.settlementapi.model.User;
import com.ref.settlementapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ref.settlementapi"})
@EnableAutoConfiguration
public class SettlementApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Lazy
    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(SettlementApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (this.userRepository.findByUsername("admin") == null) {
            User user = new User("admin", "test", "admin@mail.com", new Date(), "admin", passwordEncoder.encode("hzx9uLuNmQ"), Arrays.asList("ADMIN"));

            this.userRepository.save(user);
        }
    }
}
