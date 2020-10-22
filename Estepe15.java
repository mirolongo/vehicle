package vehicles;

public class Estepe15 implements Wheel{

	int x =1;
	@Override
	public int getSize() {
		x = 2;
		return 0;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void testaRoda() {
		
	}
	@Override
	public void concluiTeste() {
		System.out.println("Teste nao concluido");
		Wheel.super.concluiTeste();
	}
	public final void Teste2() {
		
	}
	public class Estepe16 extends Estepe15{
		@Override
		public int getSize() {
			return 1;
		}
	}
}
