package br.com.johabfreitas.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.johabfreitas.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
