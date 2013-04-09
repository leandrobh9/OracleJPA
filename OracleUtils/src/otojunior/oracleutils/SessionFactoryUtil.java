package otojunior.oracleutils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Session factory Utils. Usado atualmente como um auxiliar para a criação de banco.
 * @author oto.junior
 */
public class SessionFactoryUtil {
	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("local");
		System.out.println("E.M. Factory Open? " + emf.isOpen());
		emf.close();
	}
}
