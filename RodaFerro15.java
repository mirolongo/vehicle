package vehicles;

public class RodaFerro15 implements Wheel {

	int tamanho;
	int largura;
	RodaFerro15(int x, int y){
		tamanho = x;
		largura = y;
	}
	@Override
	public int getSize() {
		return tamanho;
	}
	@Override
	public int getWidth() {
		return largura;
	}
	public void testaRoda() {
		
	}
}
