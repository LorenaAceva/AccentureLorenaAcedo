package rf.curso.S4_MiniApi2.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;

import jakarta.persistence.EntityManager;
import rf.curso.S4_MiniApi2.Model.Categoria;
import rf.curso.S4_MiniApi2.Service.JPAUtil;

public class CategoriaDao {
	EntityManager manager = JPAUtil.getEntityManager();

	// guardar Categoria
	public void guardar(Categoria Categoria) {
		manager.getTransaction().begin();
		manager.persist(Categoria);
		manager.getTransaction().commit();		
	}

	// editar Categoria
	public void editar(Categoria Categoria) {
		manager.getTransaction().begin();
		manager.merge(Categoria);
		manager.getTransaction().commit();
	}

	// buscar Categoria
	public Categoria buscar(Long id) {
		
		Categoria c = manager.find(Categoria.class, id);
		return c;
	}

	/// eliminar Categoria
	public void eliminar(Long id) {
		Categoria c = manager.find(Categoria.class, id);
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
	}

	// obtener todos los Categoria
	public List<Categoria> obtenerCategorias() {
		List<Categoria> listaCategorias = new ArrayList<>();
		Query q = (Query) manager.createQuery("SELECT c FROM Categoria c");
		listaCategorias = (List<Categoria>) q.getResultList();
		return listaCategorias;
	}
}
