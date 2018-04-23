package br.com.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

@Entity
public class Pedido {

	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;

	@JsonProperty("numero_controle")
	private Integer numeroControle;

	private BigDecimal valorProduto;

	private String nomeProduto;

	private Integer quantidade;

	private Integer idCliente;

	private LocalDate dataCriacao;

	private BigDecimal valorTotal;

	public int getId() {
		return id;
	}

	public int getNumeroControle() {
		return numeroControle;
	}

	public void setNumeroControle(int numeroControle) {
		this.numeroControle = numeroControle;
	}

	public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", numeroControle=" + numeroControle + ", valorProduto=" + valorProduto + ", nomeProduto="
				+ nomeProduto + ", quantidade=" + quantidade + ", idCliente=" + idCliente + ", dataCriacao="
				+ dataCriacao + "]";
	}

	public String toJson() {
		return new Gson().toJson(this);
	}

}
