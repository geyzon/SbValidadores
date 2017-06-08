package bean;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import enumerations.Opcao;

@Named ("form")
@RequestScoped
public class FormBean implements Serializable {

	private static final long serialVersionUID = 6633745471462109665L;
	
	private Integer numeroInteiro;
	private Double numeroDecimal;
	private Character caractere;
	private Date data;
	private Opcao opcao;
	
	public Integer getNumeroInteiro() {
		return numeroInteiro;
	}
	public void setNumeroInteiro(Integer numeroInteiro) {
		this.numeroInteiro = numeroInteiro;
	}
	public Double getNumeroDecimal() {
		return numeroDecimal;
	}
	public void setNumeroDecimal(Double numeroDecimal) {
		this.numeroDecimal = numeroDecimal;
	}
	public Character getCaractere() {
		return caractere;
	}
	public void setCaractere(Character caractere) {
		this.caractere = caractere;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Opcao getOpcao() {
		return opcao;
	}
	public void setOpcao(Opcao opcao) {
		this.opcao = opcao;
	}
	
	public String processar() {
		System.out.println("Número Inteiro: " + this.numeroInteiro );
		System.out.println("Número Decimal: " + this.numeroDecimal );
		System.out.println("Caractere: " + this.caractere );
		System.out.println("Data: " + this.data );
		System.out.println("Opção: " + this.opcao );
		return "result";
	}

}
