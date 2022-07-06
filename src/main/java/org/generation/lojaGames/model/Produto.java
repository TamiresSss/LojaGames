package org.generation.lojaGames.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String nome;
	
	private String controleRemoto;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDeCompra = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getControleRemoto() {
		return controleRemoto;
	}

	public void setControleRemoto(String controleRemoto) {
		this.controleRemoto = controleRemoto;
	}

	public Date getDataDeCompra() {
		return dataDeCompra;
	}

	public void setDataDeCompra(Date dataDeCompra) {
		this.dataDeCompra = dataDeCompra;
	}

}
