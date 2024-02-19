package br.com.marcos.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Service;

import br.com.marcos.entity.User;
import br.com.marcos.model.request.UserRequest;
@Service
@Mapper(
		componentModel = "spring"
)
public interface UserMapper {
	
	@Mapping(target = "id", ignore = true)
	User toEntity(final UserRequest request);
}
