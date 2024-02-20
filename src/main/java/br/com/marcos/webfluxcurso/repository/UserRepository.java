package br.com.marcos.webfluxcurso.repository;

import br.com.marcos.webfluxcurso.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private ReactiveMongoTemplate mongoTemplate;

    public Mono<User> save(final User user) {
        return mongoTemplate.save(user);
    }
}
