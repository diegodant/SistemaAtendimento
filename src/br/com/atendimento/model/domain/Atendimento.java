package br.com.atendimento.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.atendimento.utils.NotaAtendimentoEnum;

@Entity
@Table(name = "ATENDIMENTO", schema="ATENDIMENTO_DB")
public class Atendimento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	 @Id
	 @GeneratedValue
	 @Column( name = "PROTOCOLO")
	  private Integer protocolo;
	  
	  @Column(name = "NOME_CLIENTE")
	  private String nomeCliente;
	  
	  @Column(name = "DETALHAMENTO")
	  private String detalhamento;
	  
	  @Column(name = "ATENDIMENTO_ENUM")
	  private NotaAtendimentoEnum atendimentoEnum;

	public Integer getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Integer protocolo) {
		this.protocolo = protocolo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDetalhamento() {
		return detalhamento;
	}

	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}

	public NotaAtendimentoEnum getAtendimentoEnum() {
		return atendimentoEnum;
	}

	public void setAtendimentoEnum(NotaAtendimentoEnum atendimentoEnum) {
		this.atendimentoEnum = atendimentoEnum;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(this.protocolo);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	  
	  

}
