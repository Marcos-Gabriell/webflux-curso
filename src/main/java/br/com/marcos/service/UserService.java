package br.com.marcos.service;

import org.springframework.stereotype.Service;

import br.com.marcos.entity.User;
import br.com.marcos.mapper.UserMapper;
import br.com.marcos.model.request.UserRequest;
import br.com.marcos.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository repository;
	private final UserMapper mapper;

	public Mono<User> save(final UserRequest request) {
		return repository.save(mapper.toEntity(request));
	}
}
