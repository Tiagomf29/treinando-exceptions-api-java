package br.com.treinandoexcpetionsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treinandoexcpetionsapi.repository.ClienteRepository;

@Service
public class ClienteService { 

	@Autowired
	ClienteRepository clienteRepository;
	
	public void deletar(Integer id){
		
		clienteRepository.deleteById(id);
	}
	
}
