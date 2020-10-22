package vehicles;

public interface Wheel {

	int getSize();
	int getWidth();
	void testaRoda();
	default void concluiTeste() {
		System.out.println("Teste realizado");
		//teste commit
	}
	
}
