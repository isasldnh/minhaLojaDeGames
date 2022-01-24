package br.org.generation.minhaLojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	
	@NotNull (message = "Você precisa dizer o nome da categoria do produto que procura")
	@Size (min = 10, max = 100)
	private String nome;
	
	@NotNull (message = "Você precisa dizer o número do corredor ao qual o produto pertence")
	@Size (min = 10, max = 100)
	private long corredor;
	
	@NotNull (message = "Preencha o fabricante do jogo")
	@Size (min = 10, max = 100)
	private String fabricante;
	
	private Produto produto;

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

	public long getCorredor() {
		return corredor;
	}

	public void setCorredor(long corredor) {
		this.corredor = corredor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}