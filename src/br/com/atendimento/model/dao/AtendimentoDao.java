package br.com.atendimento.model.dao;

import java.util.List;

import br.com.atendimento.model.domain.Atendimento;

public interface AtendimentoDao {
	
	public Atendimento salvarOuAtualizar (Atendimento entity);   
	
	public void remover(Atendimento entity);

	public List<Atendimento> listar();

	public Atendimento findByProtocolo(Integer protocolo);
	
	

}
