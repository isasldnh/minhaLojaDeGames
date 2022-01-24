package br.org.generation.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository<Produto> extends JpaRepository <Produto, Long> {
	private List <Produto> findAllByTituloContainingIgnoreCase(String nome) {
	}
}
