package br.org.generation.minhaLojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "table_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull (message = "O atributo nome não pode estar em branco")
	@Size (min=3, max=25, message = "O mínimo de caracteres é 3 e o máximo é 25.")
	private String nome;
	
	@NotNull (message = "O atributo usuario não pode estar em branco")
	@Size (min=3, max=100, message = "O mínimo de caracteres é 3 e o máximo é 100.")
	private String usuario;
	
	@NotNull (message = "O atributo senha não pode estar em branco")
	@Size (min=3, max=100, message = "O mínimo de caracteres é 3 e o máximo é 100.")
	private String senha;
	
	private String foto;

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
}
