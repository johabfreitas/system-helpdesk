package br.com.johabfreitas.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.johabfreitas.helpdesk.domain.Chamado;
import br.com.johabfreitas.helpdesk.domain.Cliente;
import br.com.johabfreitas.helpdesk.domain.Tecnico;
import br.com.johabfreitas.helpdesk.domain.enums.Perfil;
import br.com.johabfreitas.helpdesk.domain.enums.Prioridade;
import br.com.johabfreitas.helpdesk.domain.enums.Status;
import br.com.johabfreitas.helpdesk.repositories.ChamadoRepository;
import br.com.johabfreitas.helpdesk.repositories.ClienteRepository;
import br.com.johabfreitas.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Pedro João", "03749725080", "pedrojoao@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Tovald", "23426059002", "linus@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
