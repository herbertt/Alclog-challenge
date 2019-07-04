package com.alclog.challenge.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "UNIDADE")
public class Unidade implements java.io.Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "nome")
    private String nome;
    
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "idProduto", referencedColumnName = "id")
    @JsonBackReference
	private Produto produto;
	
	public Unidade() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public Unidade(Long id, String nome) {
		super();
		this.id = id;	
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
    
	
}
