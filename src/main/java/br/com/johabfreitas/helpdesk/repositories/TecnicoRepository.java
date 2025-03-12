package br.com.johabfreitas.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.johabfreitas.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
