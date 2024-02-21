package br.com.marcos.model.response;

public record UserResponse(
        String id,
        String name,
        String email,
        String password
) { }
