package otojunior.oracleutils;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class C extends B{

	@Column(name="qualquer")
	private String qualquer;
}
