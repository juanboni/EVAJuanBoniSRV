package ec.edu.ups.pwp.EVABoniJuanSRV.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pwp.EVABoniJuanSRV.modelo.Automovil;

@Stateless
public class AutomovilDAO {
	@PersistenceContext // coge el datasourses que tenemos en el proyecto(persistence.xml)
	private EntityManager em;
	
	public void insert(Automovil p) {
		em.persist(p);
	}

	
	public List<Automovil> getList(){
		List<Automovil> listado=new ArrayList<Automovil>();
		String jpql="SELECT p FROM Automovil p";
		Query query= em.createQuery(jpql,Automovil.class);
		listado = query.getResultList();
		return listado;
	}
}
