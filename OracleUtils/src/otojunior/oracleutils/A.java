package otojunior.oracleutils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="TableA")
@Inheritance(strategy=InheritanceType.JOINED)
public class A {

	@Id @GeneratedValue
	private Long id;
	
	@NotNull
	@Column(name="nome")
	private String nome;
}
