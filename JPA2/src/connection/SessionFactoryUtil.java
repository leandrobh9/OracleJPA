package connection;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Pessoa;


/**
 * @author Leandro Souza
 */
public class SessionFactoryUtil {
	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hsqldb");
		System.out.println("E.M. Factory Open? " + emf.isOpen());
		
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = new Pessoa();
		p.setNome("Leandro");
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		TypedQuery<Pessoa> tq = em.createNamedQuery("find", Pessoa.class);
		List<Pessoa> l = tq.getResultList();
		
		for (Pessoa pess : l){
			System.out.println(pess.getId() + " " + pess.getNome());
		}
		
		em.close();
		emf.close();
	}
}
