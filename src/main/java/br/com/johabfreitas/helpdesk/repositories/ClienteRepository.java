package br.com.johabfreitas.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.johabfreitas.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
