package br.com.atendimento.service;

import java.util.List;

import br.com.atendimento.model.domain.Atendimento;

public interface AtendimentoService {
	
	public void salvar(Atendimento atendimento);
     
	public void remover(Integer protocolo);
     
	public List<Atendimento> listarTodos();

}
