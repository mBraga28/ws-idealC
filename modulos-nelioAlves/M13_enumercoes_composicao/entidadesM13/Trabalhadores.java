package entidadesM13;

import entidadesEnumM13.NivelTrabalhadores;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhadores {
	
	private String nome;
	private NivelTrabalhadores nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<HoraDeContrato> contratos = new ArrayList<>();
	
	
	public Trabalhadores() {
	}


	public Trabalhadores(String nome, NivelTrabalhadores nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public NivelTrabalhadores getNivel() {
		return nivel;
	}


	public void setNivel(NivelTrabalhadores nivel) {
		this.nivel = nivel;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public List<HoraDeContrato> getContratos() {
		return contratos;
	}
	
	public void addContrato(HoraDeContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(HoraDeContrato contrato) {
		contratos.remove(contrato);
	}
	
	public Double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HoraDeContrato c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	

}
