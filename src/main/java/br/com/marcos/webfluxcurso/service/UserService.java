package br.com.marcos.webfluxcurso.service;

import br.com.marcos.webfluxcurso.entity.User;
import br.com.marcos.webfluxcurso.model.request.UserRequest;
import br.com.marcos.webfluxcurso.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {


    private final UserRepository repository;
    public Mono<User> save(final UserRequest request) {
        repository.save();
    }
}
