package connection;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Pessoa;


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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hsqldb");
		System.out.println("E.M. Factory Open? " + emf.isOpen());
		
		EntityManager em = emf.createEntityManager();
		
		//em.setFlushMode(FlushModeType.AUTO);
		Pessoa p = new Pessoa();
		p.setNome("Leandro");
		
		em.getTransaction().begin();
		em.persist(p);
		em.flush();
		em.getTransaction().commit();
		
		Query query = em.createNamedQuery("find");
		List<Pessoa> l = query.getResultList();
		
		for (Pessoa pess : l){
			System.out.println(pess.getNome());
		}
		
		em.close();
		emf.close();
	}
}
