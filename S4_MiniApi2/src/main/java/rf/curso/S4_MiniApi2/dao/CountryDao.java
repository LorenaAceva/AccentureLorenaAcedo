package rf.curso.S4_MiniApi2.dao;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import rf.curso.S4_MiniApi2.Model.Country;
import rf.curso.S4_MiniApi2.Service.JPAUtil;

public class CountryDao {
	EntityManager manager = JPAUtil.getEntityManager();

	// guardar Country
	public void guardar(Country country) {
		manager.getTransaction().begin();
		manager.persist(country);
		manager.getTransaction().commit();		
	}

	// editar Country
	public void editar(Country country) {
		manager.getTransaction().begin();
		manager.merge(country);
		manager.getTransaction().commit();
	}

	// buscar Country
	public Country buscar(String id) {
		
		Country c = manager.find(Country.class, id);
		return c;
	}

	/// eliminar Country
	public void eliminar(String id) {
		Country c = manager.find(Country.class, id);
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
	}
	//Eliminar Country
	public void eliminar(Country c) {
		eliminar(c.getCountry_id());
	}

	// obtener todos los Country
	public List<Country> obtenerCountry() {
		List<Country> listaCountry = new ArrayList<>();
		Query q = (Query) manager.createQuery("SELECT c FROM Categoria c");
		listaCountry = (List<Country>) q.getResultList();
		return listaCountry;
	}
}
