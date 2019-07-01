package com.alclog.challenge.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	@Column(name = "caracteristicas")
    private String caracteristicas;
	 
	@Column(name = "unidades_medida")
    private String unidades_medida;
	
	

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Produto(Long id, String codigo, String nome, String descricao, String imagem, String codigo_barras,
			String caracteristicas, String unidades_medida) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.imagem = imagem;
		this.codigo_barras = codigo_barras;
		this.caracteristicas = caracteristicas;
		this.unidades_medida = unidades_medida;
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

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getUnidades_medida() {
		return unidades_medida;
	}

	public void setUnidades_medida(String unidades_medida) {
		this.unidades_medida = unidades_medida;
	}
	
	
	
}
