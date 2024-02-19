package br.com.marcos.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.marcos.entity.User;
import br.com.marcos.model.request.UserRequest;

@Mapper(
		componentModel = "spring"
)
public interface UserMapper {
	
	@Mapping(target = "id", ignore = true)
	User toEntity(final UserRequest request);
}
