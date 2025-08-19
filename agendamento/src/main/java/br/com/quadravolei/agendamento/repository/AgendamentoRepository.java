package br.com.quadravolei.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.quadravolei.agendamento.model.Agendamento;

// Esta interface herda todos os métodos básicos de acesso ao banco de dados (salvar, buscar, deletar, etc.)
// JpaRepository<TipoDoModel, TipoDoId>
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

}