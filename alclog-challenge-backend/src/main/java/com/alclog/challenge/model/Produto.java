package com.alclog.challenge.model;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "PRODUTO")
public class Produto implements java.io.Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "codigo")
    private String codigo;
	
    @Column(name = "nome")
    private String nome;
	
	@Column(name = "descricao")
    private String descricao;
	
	@Column(name = "imagem")
    private String imagem;
	
	@Column(name = "codigo_barras")
    private String codigo_barras;	
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "produto", orphanRemoval = true)
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	@JsonManagedReference
	private Set<Caracteristica> caracteristicas = new HashSet<Caracteristica>();
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "produto", orphanRemoval = true)
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	@JsonManagedReference
	private Set<Unidade> unidades = new HashSet<Unidade>();
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(Long id, String codigo, String nome, String descricao, String imagem, String codigo_barras,
			Set<Caracteristica> caracteristicas, Set<Unidade> unidades) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.imagem = imagem;
		this.codigo_barras = codigo_barras;
		this.caracteristicas = caracteristicas;
		this.unidades = unidades;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getCodigo_barras() {
		return codigo_barras;
	}

	public void setCodigo_barras(String codigo_barras) {
		this.codigo_barras = codigo_barras;
	}

	public Set<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Set<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Set<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(Set<Unidade> unidades) {
		this.unidades = unidades;
	}

	
	
}
