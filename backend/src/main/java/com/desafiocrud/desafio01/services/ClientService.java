package com.desafiocrud.desafio01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiocrud.desafio01.entities.Client;
import com.desafiocrud.desafio01.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	public List<Client> findAll() {
		return repository.findAll();
	}
 	
}
