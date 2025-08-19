package br.com.quadravolei.agendamento.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.quadravolei.agendamento.model.Agendamento;
import br.com.quadravolei.agendamento.repository.AgendamentoRepository;

@RestController // Define que esta classe é um controlador REST
@RequestMapping("/api/agendamentos") // Define o endereço base para todos os métodos nesta classe
@CrossOrigin(origins = "*") // Permite que seu front-end (mesmo em localhost) acesse esta API
public class AgendamentoController {

    @Autowired // Injeção de dependência: o Spring vai nos dar uma instância do Repository
    private AgendamentoRepository agendamentoRepository;

    // Endpoint para LISTAR todos os agendamentos
    // Acessado via: GET http://localhost:8080/api/agendamentos
    @GetMapping
    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }

    // Endpoint para CRIAR um novo agendamento
    // Acessado via: POST http://localhost:8080/api/agendamentos
    @PostMapping
    public Agendamento criarAgendamento(@RequestBody Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }
}