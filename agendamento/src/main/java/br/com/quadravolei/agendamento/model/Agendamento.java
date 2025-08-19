package br.com.quadravolei.agendamento.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Avisa ao JPA que esta classe representa uma tabela no banco de dados
public class Agendamento {

    @Id // Marca o campo como a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Diz ao banco para gerar o valor do ID automaticamente
    private Long id;

    private String nomeCliente;
    private LocalDateTime dataHora;
    private int numeroQuadra;

    // Getters e Setters (necessários para o JPA funcionar)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public int getNumeroQuadra() {
        return numeroQuadra;
    }
    public void setNumeroQuadra(int numeroQuadra) {
        this.numeroQuadra = numeroQuadra;
    }
}

