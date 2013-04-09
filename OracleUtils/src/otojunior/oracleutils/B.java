package otojunior.oracleutils;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class B extends A{

	@Column(name="numero")
	private Integer numero;

}
