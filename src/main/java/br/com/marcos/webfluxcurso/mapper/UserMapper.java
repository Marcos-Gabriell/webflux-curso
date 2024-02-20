package br.com.marcos.webfluxcurso.mapper;

import br.com.marcos.webfluxcurso.entity.User;
import br.com.marcos.webfluxcurso.model.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(final UserRequest request);
}
