package br.com.johabfreitas.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.johabfreitas.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
