package asd;

import javax.persistence.EntityManager;

public class BuscandoVeiculo1 {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		Veiculo2 veiculo = manager.find(Veiculo2.class, 1L);
		System.out.println("Veículo de código " + veiculo.getCodigo() + " é um " + veiculo.getModelo());
		manager.close();
		JpaUtil.close();
	}
}