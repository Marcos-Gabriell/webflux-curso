package br.com.marcos.model.request;

public record UserRequest(
		String name,
		String email,
		String password
) {}
