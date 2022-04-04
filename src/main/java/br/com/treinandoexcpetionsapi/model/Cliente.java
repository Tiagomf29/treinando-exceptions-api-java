package br.com.treinandoexcpetionsapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 60, nullable = false)
	private String nome;
	
	@Column(length = 2, nullable = false)
	private short idade;
	
	@Column(length = 60)
	private String mae;

}
