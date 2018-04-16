package asd;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ExcluindoVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		Veiculo2 veiculo = manager.find(Veiculo2.class, 1L);
		manager.remove(veiculo);
		tx.commit();
		manager.close();
		JpaUtil.close();
	}
}