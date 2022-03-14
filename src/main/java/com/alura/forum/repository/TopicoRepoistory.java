package com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.forum.src.main.java.br.com.alura.forum.modelo.Topico;

public interface TopicoRepoistory extends JpaRepository<Topico, Long>{

	List<Topico> findByCursoNome(String nomeCurso);	

}
