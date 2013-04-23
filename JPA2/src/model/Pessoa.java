package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="find", query="select new Pessoa(p.id, p.nome) from Pessoa p")
})
public class Pessoa {

	public Pessoa() {
	}
	
	public Pessoa(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@Id @GeneratedValue
	private Long id;
	
	@Column(length=32)
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
