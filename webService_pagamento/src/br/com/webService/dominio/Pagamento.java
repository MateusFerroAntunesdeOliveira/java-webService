package br.com.webService.dominio;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Pagamento {
	private Integer codigo;
	private String descricao;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataVencimento;
	private Double valor;
	private Boolean pago;
	
	public Pagamento() {}
	
	public Pagamento(Integer codigo, String descricao, LocalDate dataVencimento, Double valor, Boolean pago) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
		this.pago = pago;
	}
	
	//-> Codigo
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	//-> Descricao
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//-> DataVencimento
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	//-> Valor
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	//-> Pago
	public Boolean getPago() {
		return pago;
	}
	public void setPago(Boolean pago) {
		this.pago = pago;
	}

	@Override
	public String toString() {
		return "Pagamento [codigo=" + codigo + ", descricao=" + descricao + ", dataVencimento=" + dataVencimento
				+ ", valor=" + valor + ", pago=" + pago + "]";
	}
}
