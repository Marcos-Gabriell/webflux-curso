package br.com.marcos.webfluxcurso.model.response;

public record UserResponse(
        String id,
        String email,
        String password
) {
}
