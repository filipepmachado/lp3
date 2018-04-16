package asd;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersistindoVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		Veiculo2 veiculo = new Veiculo2();
		veiculo.setFabricante("Honda");
		veiculo.setModelo("Civic");
		veiculo.setAnoFabricacao(2012);
		veiculo.setAnoModelo(2013);
		veiculo.setValor(new BigDecimal(71300));
		manager.persist(veiculo);
		tx.commit();
		manager.close();
		JpaUtil.close();
		VeiculoId id = new VeiculoId("ABC-1234", "Uberlândia");
		Veiculo2 veiculo1 = manager.find(Veiculo2.class, id);
		System.out.println("Placa: " + veiculo1.getId().getPlaca());
		System.out.println("Cidade: " + veiculo1.getId().getCidade());
		System.out.println("Fabricante: " + veiculo1.getFabricante());
		System.out.println("Modelo: " + veiculo1.getModelo());
	}
	
}