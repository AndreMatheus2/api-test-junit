package br.com.andrematheus2.api.config;

import br.com.andrematheus2.api.domain.User;
import br.com.andrematheus2.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDbB() {
        User u1 = new User(null, "Andre", "am_arao@hotmail.com", "123");
        User u2 = new User(null, "Mi", "mi_mi@hotmail.com", "123");

        repository.saveAll(List.of(u1,u2));

    }


}